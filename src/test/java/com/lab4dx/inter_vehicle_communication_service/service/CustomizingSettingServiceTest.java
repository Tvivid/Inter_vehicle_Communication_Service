package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CustomizingSettingServiceTest {

    @Autowired
    private CustomizingSettingService customizingSettingService;

    @Test
    void getSettingsByMember() {
        String memberId = "user1";
        List<CustomizingSetting> expectedSettings = customizingSettingService.getSettingsByMember(memberId);
        System.out.println(expectedSettings);

    }

//    @Test
//    public void testInsertSetting() {
//        // Given: 새로운 커스터마이징 설정 객체 생성
//        CustomizingSetting setting = new CustomizingSetting();
//        setting.setMemberId("user1");
//        setting.setEmojiId("1");
//        setting.setMessage("Test message");
//        setting.setImagePath("/test/path");
//        setting.setEmojiColor("#FF5733");
//
//        // When: 커스터마이징 설정 삽입
//        customizingSettingService.createSettings(setting);
//
//        // Then: 삽입된 설정이 데이터베이스에 있는지 확인
//
//    }
}
