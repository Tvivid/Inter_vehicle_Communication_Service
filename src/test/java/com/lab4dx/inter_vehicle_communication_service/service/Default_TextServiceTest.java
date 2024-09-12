package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Text;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class Default_TextServiceTest {

    @Autowired
    private Default_TextServiceImp defaultTextService;

    @Test
    void getTextsBySentiment() {
        String sentiment = "positive"; // 테스트할 감정 유형

        // When
        List<Default_Text> texts = defaultTextService.getTextsBySentiment(sentiment);

        System.out.println("Texts retrieved for sentiment: " + sentiment);
        for (Default_Text text : texts) {
            System.out.println(text);
        }


    }

//    @Test
//    void testGetTextsBySentiment() {
//        String sentiment = "positive";
//        List<Default_Text> texts = defaultTextService.getTextsBySentiment(sentiment);
//        assertNotNull(texts);
//        assertFalse(texts.isEmpty());
//        assertEquals(sentiment, texts.get(0).getSentiment());
//    }
}
