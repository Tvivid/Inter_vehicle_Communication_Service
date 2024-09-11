package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Text;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface Default_TextMapper {


    List<Default_Text> findTextsBySentiment(String sentiment);


    int updateMemberEmotionSetting(String textId, String memberId);


    int insertDefaultText(Default_Text defaultText);
}
