package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import com.lab4dx.inter_vehicle_communication_service.mapper.EmojiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmojiServiceImp implements EmojiService {

    @Autowired
    private EmojiMapper emojiMapper;

    @Override
    public void insertEmoji(Emoji emoji) {
        emojiMapper.insertEmoji(emoji);
    }

    @Override
    public Emoji getEmojiById(String emojiId) {
        return emojiMapper.getEmojiById(emojiId);
    }

    @Override
    public List<Emoji> getAllEmojis() {
        return emojiMapper.getAllEmoji();
    }


}
