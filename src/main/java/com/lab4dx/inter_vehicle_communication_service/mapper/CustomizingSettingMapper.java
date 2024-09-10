package com.lab4dx.inter_vehicle_communication_service.mapper;


import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CustomizingSettingMapper {


        CustomizingSetting getSettingByMemberAndEmoji(String memberId, int emojiId);
        List<CustomizingSetting> getAllSetting();
        void insertSetting(CustomizingSetting setting);
        void updateSetting(CustomizingSetting setting);
      // 아이콘 설정 업데이트 (emoji_id와 emoji_color 업데이트)
        int updateIconSetting(String emojiId, String emojiColor, String memberId);



}
