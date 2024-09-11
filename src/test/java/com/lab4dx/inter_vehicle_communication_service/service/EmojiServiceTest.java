package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmojiServiceTest {

    @Autowired
    private EmojiService emojiService;

    @Test
    void insertEmoji() {
        Emoji emoji = new Emoji();
        emoji.setEmojiId("emoji2");
        emojiService.insertEmoji(emoji);

    }

    @Test
    void getEmojiById() {
    }

    @Test
    void getAllEmojis() {
    }
}