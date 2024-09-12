package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import com.lab4dx.inter_vehicle_communication_service.service.CustomizingSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/message_cm")
public class CustomizingSettingController {

    private static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/uploads";

    @Autowired
    private CustomizingSettingService customizingSettingService;

    // customizingId에 해당하는 설정을 화면에 표시
    @GetMapping
    public String customizingSetting(@RequestParam("customizingId") String customizingId, Model model) {
        String memberId="user1";
        CustomizingSetting setting = customizingSettingService.getSettingByIdAndMemberId(customizingId, memberId);

        if (setting != null) {
            model.addAttribute("customizingSetting", setting);
        }

        return "message_cm";  // 메시지 수정 화면 (edit-message.html)
    }

    // 수정사항을 DB에 반영
    @PutMapping("/upload")
    public String uploadImage(@RequestParam("customizingId") String customizingId,
                                              @RequestParam("emojiId") String emojiId,
                                              @RequestParam("message") String message,
                                              @RequestParam("emojiColor") String emojiColor,
                                              @RequestParam("image") MultipartFile file) throws IOException {
        String memberId = "user1";

        // 기존 설정을 가져옴
        CustomizingSetting setting = customizingSettingService.getSettingByIdAndMemberId(customizingId, memberId);



        // 이미지 파일을 서버에 저장
        String fileName = file.getOriginalFilename();
        Path filePath = Paths.get(UPLOAD_DIRECTORY, fileName);
        Files.copy(file.getInputStream(), filePath);

        // 설정 정보 업데이트
        setting.setEmojiId(emojiId);
        setting.setMessage(message);
        setting.setEmojiColor(emojiColor);
        setting.setImagePath(filePath.toString());  // 이미지 경로를 설정

        // DB에 업데이트
        customizingSettingService.updateSettings(setting);

        return "redirect:/message_main";
    }
}