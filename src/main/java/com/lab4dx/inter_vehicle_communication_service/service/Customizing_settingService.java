package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.customizing_setting;

public interface Customizing_settingService {
    // 아이콘 설정을 조회하는 메서드
    customizing_setting getIconSettingByMemberId(String memberId);

    // 아이콘의 색상과 모양을 업데이트하는 메서드
    boolean updateIconSetting(String memberId, String emojiId, String emojiColor);
}
