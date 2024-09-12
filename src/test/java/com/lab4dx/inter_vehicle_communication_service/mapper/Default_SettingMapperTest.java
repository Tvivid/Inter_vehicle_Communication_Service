package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Setting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@Transactional // 테스트 후 롤백
class Default_SettingMapperTest {


    @Autowired
    private Default_SettingMapper defaultSettingMapper;
    @Test
    void findByMemberId() {
    }

    @Test
    void insertDefault_Setting() {
        Default_Setting defaultSetting = new Default_Setting();
        defaultSetting.setTextId("text1");
        defaultSetting.setSentiment("positive");
        defaultSetting.setMemberId("user1");

        defaultSettingMapper.insertDefault_Setting(defaultSetting);

        defaultSetting.setTextId("text4");
        defaultSetting.setSentiment("negative");
        defaultSetting.setMemberId("user1");

        defaultSettingMapper.insertDefault_Setting(defaultSetting);

    }

    @Test
    void updateMemberEmotionSetting() {
    }

    @Test
    void findByMemberIdAndSentiment() {
    }

    @Test
    void FindByMemberIdAndSentiment() {

        String memberId = "user1";  // 테스트할 멤버 ID
        String sentiment = "positive";  // 테스트할 감정 유형

        // When
        String resultText = defaultSettingMapper.findByMemberIdAndSentiment(memberId, sentiment);

        System.out.println(resultText);


    }

//    @Autowired
//    private Default_SettingMapper defaultSettingMapper;
//
//    @Test
//    void testFindByMemberId() {
//        String memberId = "user123";
//        defaultSettingMapper.findByMemberId(memberId);
////        Default_Setting setting = defaultSettingMapper.findByMemberId(memberId);
////        assertNotNull(setting);
////        assertEquals(memberId, setting.getMember_id());
//    }
//
//    @Test
//    void testUpdateMemberEmotionSetting() {
//        String memberId = "user123";
//        String textId = "text001";
//        defaultSettingMapper.updateMemberEmotionSetting(textId, memberId);
////        int result = defaultSettingMapper.updateMemberEmotionSetting(textId, memberId);
////        assertEquals(1, result); // 업데이트가 성공했을 때 1 반환
//    }
}

