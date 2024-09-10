package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomizingSettingMapper {
        void insertSetting(CustomizingSetting setting);
        void updateSetting(CustomizingSetting setting);
        CustomizingSetting getSettingByMemberAndEmoji(@Param("memberId") String memberId, @Param("emojiId") String emojiId);
        List<CustomizingSetting> getSettingsByMemberId(String memberId);
}
