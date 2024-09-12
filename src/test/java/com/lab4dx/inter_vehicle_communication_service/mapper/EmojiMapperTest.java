package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmojiMapperTest {

    @Autowired
    private EmojiMapper emojiMapper;

    @Test
    void insertEmoji() {
        Emoji newEmoji = new Emoji();
        newEmoji.setEmojiId("1");  // 새로운 이모지 ID 설정

        emojiMapper.insertEmoji(newEmoji);

        newEmoji.setEmojiId("2");

        emojiMapper.insertEmoji(newEmoji);

        newEmoji.setEmojiId("3");
        emojiMapper.insertEmoji(newEmoji);
        newEmoji.setEmojiId("4");
        emojiMapper.insertEmoji(newEmoji);
        newEmoji.setEmojiId("5");
        emojiMapper.insertEmoji(newEmoji);
        newEmoji.setEmojiId("6");
        emojiMapper.insertEmoji(newEmoji);
        newEmoji.setEmojiId("7");
        emojiMapper.insertEmoji(newEmoji);
        newEmoji.setEmojiId("8");

        emojiMapper.insertEmoji(newEmoji);
    }
}

