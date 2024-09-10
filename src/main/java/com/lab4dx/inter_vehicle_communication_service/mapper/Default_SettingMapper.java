package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Setting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Default_SettingMapper {



    // 특정 사용자의 설정을 조회하는 쿼리
//    @Select("SELECT * FROM C##LAB4DX.Default_Setting WHERE member_id = #{memeberId}")
    Default_Setting findByMemberId(String memberId);

    // 사용자의 감정 설정을 업데이트하는 쿼리
//    @Update("UPDATE C##LAB4DX.Default_Setting SET text_id = #{textId} WHERE member_id = #{memberId}")
    int updateMemberEmotionSetting(String textId, String memberId);
}

