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
import java.util.UUID;

@Controller
@RequestMapping("/message_cm")
public class CustomizingSettingController {

    // 파일을 static/uploads 폴더에 저장
    private static final String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources/static/uploads";

    @Autowired
    private CustomizingSettingService customizingSettingService;

    // customizingId에 해당하는 설정을 화면에 표시
    @GetMapping
    public String customizingSetting(@RequestParam("customizingId") String customizingId, Model model) {
        String memberId = "user1";

        CustomizingSetting setting = customizingSettingService.getSettingByIdAndMemberId(customizingId, memberId);

        if (setting != null) {
            model.addAttribute("customizingSetting", setting);
        }

        return "message_cm";  // 메시지 수정 화면
    }

    // 수정사항을 DB에 반영
    @PostMapping("/upload")
    public String uploadImage(@RequestParam("customizingId") String customizingId,
                              @RequestParam("emojiId") String emojiId,
                              @RequestParam("message") String message,
                              @RequestParam("image") MultipartFile file) throws IOException {
        String memberId = "user1";

        // 기존 설정을 가져옴
        CustomizingSetting setting = customizingSettingService.getSettingByIdAndMemberId(customizingId, memberId);

        if (setting == null) {
            return "redirect:/error";  // customizingId가 유효하지 않으면 에러 처리
        }

        // 파일이 비어 있지 않으면 파일을 서버에 저장
        if (file != null && !file.isEmpty()) {
            String originalFileName = file.getOriginalFilename();
            String extension = originalFileName.substring(originalFileName.lastIndexOf("."));  // 파일 확장자 추출
            String uniqueFileName = UUID.randomUUID().toString() + extension;  // UUID를 사용하여 고유한 파일명 생성

            Path filePath = Paths.get(UPLOAD_DIRECTORY, uniqueFileName);

            // 디렉토리가 없으면 생성
            if (!Files.exists(filePath.getParent())) {
                Files.createDirectories(filePath.getParent());
            }

            Files.copy(file.getInputStream(), filePath);

            // 저장된 경로를 웹에서 접근 가능한 상대 경로로 설정
            setting.setImagePath("/uploads/" + uniqueFileName);
        }

        // 설정 정보 업데이트
        setting.setEmojiId(emojiId);
        setting.setMessage(message);

        // DB에 업데이트
        customizingSettingService.updateSettings(setting);

        return "redirect:/message_main";
    }
}