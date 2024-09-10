package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomizingSettingService {
    CustomizingSetting getSettingsByMemberAndEmoji(String memberId, int emojiId);
    List<CustomizingSetting> getAllSettings();
    void createSettings(CustomizingSetting customizingSetting);
    void updateSettings(CustomizingSetting customizingSetting);
}
