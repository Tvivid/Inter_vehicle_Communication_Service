package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface EmojiMapper {

    Emoji getEmojiById(int emojiId);
    List<Emoji> getAllEmoji();
    void insertEmoji(Emoji emoji);
    void updateEmoji(Emoji emoji);
}
