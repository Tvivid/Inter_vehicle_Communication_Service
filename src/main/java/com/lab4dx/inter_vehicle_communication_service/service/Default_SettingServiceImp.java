package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Setting;
import com.lab4dx.inter_vehicle_communication_service.dto.Default_Text;
import com.lab4dx.inter_vehicle_communication_service.mapper.Default_SettingMapper;
import com.lab4dx.inter_vehicle_communication_service.mapper.Default_TextMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Default_SettingServiceImp implements Default_SettingService {


    private Default_SettingMapper defaultSettingMapper;
    private Default_TextMapper defaultTextMapper;
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

    public List<Default_Text> getTextsBySentiment(String sentiment) {
        // DAO 또는 리포지토리를 통해 감정에 맞는 메시지 리스트를 반환
        return defaultTextMapper.findTextsBySentiment(sentiment);
    }



}
