package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Text;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Default_TextService {
    // sentiment에 따른 감정 목록을 가져옴
    List<Default_Text> getTextsBySentiment(String sentiment);

    // 사용자의 설정을 업데이트
    boolean updateMemberEmotionSetting(String memberId, String textId);
}

