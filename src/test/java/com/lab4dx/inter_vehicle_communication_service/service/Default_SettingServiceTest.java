package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Setting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class Default_SettingServiceTest {

    @Autowired
    private Default_SettingService defaultSettingService;

//    @Test
//    void testUpdateMemberSetting() {
//        String memberId = "user123";
//        String textId = "text001";
//        boolean success = defaultSettingService.updateUserSetting(memberId, textId);
//        assertTrue(success); // 업데이트 성공 시 true 반환
//    }
//
//    @Test
//    void testGetMemberSetting() {
//        String memberId = "user123";
//        Default_Setting setting = defaultSettingService.getUserSetting(memberId);
//        assertNotNull(setting);
//        assertEquals(memberId, setting.getMember_id());
//    }
}