package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.customizing_setting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomizingSettingMapper {

    // 색상변경(update), 모양변경(update), 변경값확인(select), 기존값 조회(select)
    // 특정 사용자의 아이콘 설정을 조회
    customizing_setting getIconSettingByMemberId(@Param("member_id") String memberId);

    // 아이콘 설정 업데이트 (emoji_id와 emoji_color 업데이트)
    int updateIconSetting(@Param("emoji_id") String emojiId,
                          @Param("emoji_color") String emojiColor,
                          @Param("member_id") String memberId);



}
