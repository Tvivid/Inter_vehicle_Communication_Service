package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmojiMapper {
    int insertEmoji (Emoji emoji);
}
