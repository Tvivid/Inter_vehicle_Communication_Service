package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import com.lab4dx.inter_vehicle_communication_service.mapper.CustomizingSettingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomizingSettingService {

    @Autowired
    private CustomizingSettingMapper customizingSettingMapper;

    // 새로운 커스터마이징 설정을 추가하는 메소드
    public void insertSetting(CustomizingSetting setting) {
        customizingSettingMapper.insertSetting(setting);
    }

    // 특정 회원과 이모지에 대한 커스터마이징 설정을 업데이트하는 메소드
    public void updateSetting(CustomizingSetting setting) {
        customizingSettingMapper.updateSetting(setting);
    }

    // 특정 회원과 이모지에 대한 커스터마이징 설정을 조회하는 메소드
    public CustomizingSetting getSettingByMemberAndEmoji(String memberId, String emojiId) {
        return customizingSettingMapper.getSettingByMemberAndEmoji(memberId, emojiId);
    }

    // 특정 회원의 모든 커스터마이징 설정을 조회하는 메소드
    public List<CustomizingSetting> getSettingsByMemberId(String memberId) {
        return customizingSettingMapper.getSettingsByMemberId(memberId);
    }

    public void addSetting(CustomizingSetting setting) {
    }
}
