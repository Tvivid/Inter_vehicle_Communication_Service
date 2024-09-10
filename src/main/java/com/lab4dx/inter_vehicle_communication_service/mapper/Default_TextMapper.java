package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Text;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface Default_TextMapper {

    // sentiment에 따라 감정을 조회
    @Select("SELECT * FROM C##LAB4DX.Default_Text WHERE sentiment = #{sentiment}")
    List<Default_Text> findTextsBySentiment(String sentiment);

    // 설정을 업데이트
    @Update("UPDATE C##LAB4DX.Default_Setting SET text_id = #{textId} WHERE member_id = #{memberId}")
    int updateMemberEmotionSetting(String textId, String memberId);

    @Insert("INSERT INTO C##LAB4DX.Default_Text (text_id, sentiment, text) VALUES (#{textId}, #{sentiment}, #{text})")
    int insertDefaultText(Default_Text defaultText);
}
