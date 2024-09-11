package com.lab4dx.inter_vehicle_communication_service.mapper;


import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomizingSettingMapperTest {

    @Autowired
    private CustomizingSettingMapper customizingSettingMapper;

    @Test
    void getSettingByMemberAndEmoji() {
    }

    @Test
    void getAllSetting() {
    }

    @Test
    void insertSetting() {
        CustomizingSetting customizingSetting = new CustomizingSetting();
        customizingSetting.setMemberId("user1");  // 새로운 멤버 ID
        customizingSetting.setEmojiId("1");   // 새로운 이모지 ID
        customizingSetting.setMessage("Goodbye World");
        customizingSetting.setImagePath("/images/emoji2.png");
        customizingSetting.setEmojiColor("#00FF00");

        customizingSettingMapper.insertSetting(customizingSetting);
    }

    @Test
    void updateSetting() {
      String memberId = "qwer";
        String emojiId = "emoji_02";
        String emojiColor = "#00FF00";
      
      customizingSettingMapper.updateIconSetting(emojiId, emojiColor, memberId);
    }
}

