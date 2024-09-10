package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.customizing_setting;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest  // Spring Boot 통합 테스트를 위한 어노테이션
//@Transactional   // 테스트 후 데이터베이스의 변경사항을 자동으로 롤백하여 원상복구
public class CustomizingSettingMapperTest {

    @Autowired
    private CustomizingSettingMapper customizingSettingMapper;
    // Mapper 주입
    // 각 테스트 전에 호출되는 메서드로, 테스트 데이터 삽입을 준비함.
//    @BeforeEach
//    public void setUp() {
//        // 테스트를 위한 데이터를 DB에 삽입
//        customizing_setting setting = new customizing_setting();
//        setting.setMember_id("12345");
//        setting.setEmoji_id("emoji_01");
//        setting.setEmoji_color("#FF5733");
//
//        // 만약 insert 메서드가 없다면, 이 부분에 맞게 코드를 수정하세요.
//        customizingSettingMapper.insertCustomizingSetting(setting);  // 이 부분은 insert 메서드를 정의했다고 가정한 코드입니다.
//    }
    @Test
    @Commit
    public void insert() {
        customizing_setting cs = new customizing_setting();
        cs.setMember_id("qwer");
        cs.setEmoji_id("emoji_01");
        cs.setMessage("hello");
        cs.setImage_path("address");
        cs.setEmoji_color("#000000");
        customizingSettingMapper.insert(cs);
    }

    @Test
    public void testGetIconSettingByMemberId() {
        // 테스트할 memberId를 설정 (미리 DB에 저장된 값)
        String memberId = "qwer";

        // Mapper를 사용해 DB에서 해당 사용자의 설정을 조회
        customizing_setting setting = customizingSettingMapper.getIconSettingByMemberId(memberId);

        // 조회된 설정이 null이 아니어야 함 (DB에 데이터가 존재한다고 가정)
        Assertions.assertNotNull(setting, "아이콘 설정을 가져올 수 없습니다.");

        // 예상되는 emoji_id와 emoji_color 값을 확인
        Assertions.assertEquals("emoji_01", setting.getEmoji_id(), "아이콘 ID가 예상과 다릅니다.");
        Assertions.assertEquals("#FF5733", setting.getEmoji_color(), "아이콘 색상이 예상과 다릅니다.");
    }

    @Test
    public void testUpdateIconSetting() {
        // 테스트할 memberId와 업데이트할 새로운 값 설정
        String memberId = "qwer";
        String emojiId = "emoji_02";
        String emojiColor = "#00FF00";

        // 아이콘 설정을 업데이트
        int updatedRows = customizingSettingMapper.updateIconSetting(emojiId, emojiColor, memberId);

        // 업데이트된 행 수가 1이어야 함
        Assertions.assertEquals(1, updatedRows, "아이콘 설정이 업데이트되지 않았습니다.");

        // 업데이트 후 해당 사용자의 아이콘 설정을 다시 조회
        customizing_setting updatedSetting = customizingSettingMapper.getIconSettingByMemberId(memberId);

        // 새로운 값이 정확하게 업데이트되었는지 확인
        Assertions.assertEquals(emojiId, updatedSetting.getEmoji_id(), "아이콘 ID가 업데이트되지 않았습니다.");
        Assertions.assertEquals(emojiColor, updatedSetting.getEmoji_color(), "아이콘 색상이 업데이트되지 않았습니다.");
    }
}

