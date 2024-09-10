package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.Emoji;
import com.lab4dx.inter_vehicle_communication_service.service.EmojiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emojis")
public class EmojiController {

    @Autowired
    private EmojiService emojiService;

    // 새로운 이모지 추가
    @PostMapping
    public ResponseEntity<String> addEmoji(@RequestBody Emoji emoji) {
        emojiService.insertEmoji(emoji);
        return ResponseEntity.ok("Emoji added successfully");
    }

    // 이모지 삭제
    @DeleteMapping("/{emojiId}")
    public ResponseEntity<String> deleteEmoji(@PathVariable String emojiId) {
        emojiService.deleteEmoji(emojiId);
        return ResponseEntity.ok("Emoji deleted successfully");
    }

    // 이모지 ID로 이모지 조회
    @GetMapping("/{emojiId}")
    public ResponseEntity<Emoji> getEmojiById(@PathVariable String emojiId) {
        Emoji emoji = emojiService.getEmojiById(emojiId);
        return ResponseEntity.ok(emoji);
    }

    // 모든 이모지 조회
    @GetMapping
    public ResponseEntity<List<Emoji>> getAllEmojis() {
        List<Emoji> emojis = emojiService.getAllEmojis();
        return ResponseEntity.ok(emojis);
    }
}
