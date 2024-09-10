package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.mapper.CustomizingSettingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Customizing_settingServiceImp implements Customizing_settingService {
    private CustomizingSettingMapper customizingSettingMapper;
    @Autowired
    public Customizing_settingServiceImp(CustomizingSettingMapper customizingSettingMapper) {
        this.customizingSettingMapper = customizingSettingMapper;
    }


    @Override
    // 특정 사용자의 아이콘 설정을 조회하는 메서드
    public customizing_setting getIconSettingByMemberId(String memberId) {
        return customizingSettingMapper.getIconSettingByMemberId(memberId);
    }

    @Override
    // 특정 사용자의 아이콘의 색상과 모양을 업데이트 하는 메서드
    public boolean updateIconSetting(String memberId, String emojiId, String emojiColor) {
        int updatedRows = customizingSettingMapper.updateIconSetting(emojiId, emojiColor, memberId);
        return updatedRows > 0; // 업데이트된 행이 있으면 true 반환
    }
}
