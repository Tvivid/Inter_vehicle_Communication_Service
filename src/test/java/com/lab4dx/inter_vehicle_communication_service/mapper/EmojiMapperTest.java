package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmojiMapperTest {

    @Autowired
    EmojiMapper emojiMapper;

    @Test
    public void insertEmoji() {
        Emoji emoji = new Emoji();
        emoji.setEmoji_id("emoji_01");

        emojiMapper.insertEmoji(emoji);

    }
}
