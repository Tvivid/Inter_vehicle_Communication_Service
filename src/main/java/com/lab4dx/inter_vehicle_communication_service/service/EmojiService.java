package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import com.lab4dx.inter_vehicle_communication_service.mapper.EmojiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmojiService {

    @Autowired
    private EmojiMapper emojiMapper;

    // 새로운 이모지를 추가하는 메소드
    public void insertEmoji(Emoji emoji) {
        emojiMapper.insertEmoji(emoji);
    }

    // 특정 이모지 ID로 이모지를 조회하는 메소드
    public Emoji getEmojiById(String emojiId) {
        return emojiMapper.selectEmojiById(emojiId);
    }

    // 모든 이모지를 조회하는 메소드
    public List<Emoji> getAllEmojis() {
        return emojiMapper.getAllEmojis();
    }

    // 특정 이모지 ID로 이모지를 삭제하는 메소드
    public void deleteEmoji(String emojiId) {
        emojiMapper.deleteEmoji(emojiId);
    }
}
