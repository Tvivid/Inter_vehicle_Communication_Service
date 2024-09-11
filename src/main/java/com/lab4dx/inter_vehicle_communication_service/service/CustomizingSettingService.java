package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface CustomizingSettingService {
    CustomizingSetting getSettingsByMemberAndEmoji(String memberId, String emojiId);  // int -> String
    List<CustomizingSetting> getSettingsByMember(String memberId);
    void createSettings(CustomizingSetting customizingSetting);
    void updateSettings(CustomizingSetting customizingSetting);
}