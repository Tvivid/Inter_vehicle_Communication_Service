package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Setting;
import com.lab4dx.inter_vehicle_communication_service.mapper.Default_SettingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Default_SettingServiceImp implements Default_SettingService {


    private Default_SettingMapper defaultSettingMapper;
    @Autowired
    public Default_SettingServiceImp (Default_SettingMapper defaultSettingMapper){
        this.defaultSettingMapper = defaultSettingMapper;
    }

    // 사용자의 설정을 가져옴
    @Override
    public Default_Setting getUserSetting(String memberId) {
        return defaultSettingMapper.findByMemberId(memberId);
    }

    // 사용자의 설정을 업데이트
    @Override
    public boolean updateUserSetting(String memberId, String textId) {
        int rowsAffected = defaultSettingMapper.updateMemberEmotionSetting(textId, memberId);
        return rowsAffected > 0; // 업데이트가 성공하면 true 반환
    }
}
