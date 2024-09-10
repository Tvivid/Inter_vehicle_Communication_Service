package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;


import com.lab4dx.inter_vehicle_communication_service.mapper.CustomizingSettingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/customizing")
public class CustomizingSettingController {

    private static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/uploads";

    @Autowired
    private CustomizingSettingMapper customizingSettingMapper;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("memberId") String memberId,
                                              @RequestParam("emojiId") int emojiId,
                                              @RequestParam("message") String message,
                                              @RequestParam("emojiColor") String emojiColor,
                                              @RequestParam("image") MultipartFile file) throws IOException {

        // 이미지 파일을 서버에 저장
        String fileName = file.getOriginalFilename();
        Path filePath = Paths.get(UPLOAD_DIRECTORY, fileName);
        Files.copy(file.getInputStream(), filePath);

        // 이미지 경로를 DB에 저장할 CustomizingSetting 객체 생성
        CustomizingSetting setting = new CustomizingSetting();
        setting.setMemberId(memberId);
        setting.setEmojiId(emojiId);
        setting.setMessage(message);
        setting.setEmojiColor(emojiColor);
        setting.setImagePath(filePath.toString());  // 이미지 경로를 설정

        // DB에 삽입
        customizingSettingMapper.insertSetting(setting);

        return ResponseEntity.ok("File uploaded successfully: " + fileName);
    }


}
