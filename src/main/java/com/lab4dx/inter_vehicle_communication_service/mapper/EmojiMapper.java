package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmojiMapper {
    void insertEmoji(Emoji emoji);
    Emoji selectEmojiById(String emojiId);
    void deleteEmoji(String emojiId);
    List<Emoji> getAllEmojis();
}
