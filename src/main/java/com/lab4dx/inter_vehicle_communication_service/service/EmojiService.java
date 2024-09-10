package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import com.lab4dx.inter_vehicle_communication_service.mapper.EmojiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmojiService {

    void insertEmoji(Emoji emoji);
    Emoji getEmojiById(String emojiId);  // String으로 변경
    List<Emoji> getAllEmojis();

}
