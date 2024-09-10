package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import com.lab4dx.inter_vehicle_communication_service.service.CustomizingSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/custom-settings")
public class CustomizingSettingController {

    @Autowired
    private CustomizingSettingService customizingSettingService;

    // 새로운 커스터마이징 설정 추가
    @PostMapping
    public ResponseEntity<String> addSetting(@RequestBody CustomizingSetting setting) {
        customizingSettingService.insertSetting(setting);
        return ResponseEntity.ok("Customizing setting added successfully");
    }

    // 커스터마이징 설정 업데이트
    @PutMapping("/{memberId}/{emojiId}")
    public ResponseEntity<String> updateSetting(@PathVariable String memberId,
                                                @PathVariable String emojiId,
                                                @RequestBody CustomizingSetting setting) {
        setting.setMemberId(memberId);
        setting.setEmojiId(emojiId);
        customizingSettingService.updateSetting(setting);
        return ResponseEntity.ok("Customizing setting updated successfully");
    }

    // 특정 회원과 이모지의 커스터마이징 설정 조회
    @GetMapping("/{memberId}/{emojiId}")
    public ResponseEntity<CustomizingSetting> getSettingByMemberAndEmoji(@PathVariable String memberId,
                                                                         @PathVariable String emojiId) {
        CustomizingSetting setting = customizingSettingService.getSettingByMemberAndEmoji(memberId, emojiId);
        return ResponseEntity.ok(setting);
    }

    // 특정 회원의 모든 커스터마이징 설정 조회
    @GetMapping("/{memberId}")
    public ResponseEntity<List<CustomizingSetting>> getSettingsByMemberId(@PathVariable String memberId) {
        List<CustomizingSetting> settings = customizingSettingService.getSettingsByMemberId(memberId);
        return ResponseEntity.ok(settings);
    }
}
