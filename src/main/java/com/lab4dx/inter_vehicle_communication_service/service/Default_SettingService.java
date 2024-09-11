package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Setting;
import com.lab4dx.inter_vehicle_communication_service.dto.Default_Text;

import java.util.List;

public interface Default_SettingService {
    Default_Setting getUserSetting(String memberId);

    boolean updateUserSetting(String memberId, String textId);

    String getTextsBySentiment(String memberId, String sentiment);
}
