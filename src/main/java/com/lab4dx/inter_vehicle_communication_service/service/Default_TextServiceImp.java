package com.lab4dx.inter_vehicle_communication_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lab4dx.inter_vehicle_communication_service.mapper.Default_TextMapper;
import com.lab4dx.inter_vehicle_communication_service.dto.Default_Text;

import java.util.List;

@Service
public class Default_TextServiceImp implements Default_TextService {

    @Autowired
    private Default_TextMapper defaultTextMapper;

    // sentiment에 따른 감정 목록을 가져옴
    public List<Default_Text> getTextsBySentiment(String sentiment) {
        return defaultTextMapper.findTextsBySentiment(sentiment);
    }

    // 사용자의 설정을 업데이트
    public boolean updateMemberEmotionSetting(String memberId, String textId) {
        return defaultTextMapper.updateMemberEmotionSetting(textId, memberId) > 0;
    }
}
