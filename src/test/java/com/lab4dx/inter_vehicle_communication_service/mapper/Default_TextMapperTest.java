package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Default_Text;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Default_TextMapperTest {

    @Autowired
    private Default_TextMapper defaultTextMapper;

    @Test
    void findTextsBySentiment() {
    }

    @Test
    void updateMemberEmotionSetting() {
    }

    @Test
    void insertDefaultText() {
        Default_Text default_text = new Default_Text();
        default_text.setText_id("text1");
        default_text.setSentiment("positive");
        default_text.setText("thank you you");
        defaultTextMapper.insertDefaultText(default_text);

//        Default_Text default_text = new Default_Text();
//        default_text.setText_id("text2");
//        default_text.setSentiment("negative");
//        default_text.setText("Stop!!!");
//        defaultTextMapper.insertDefaultText(default_text);
    }

//    @Test
//    void testFindTextsBySentiment() {
//        String sentiment = "positive";
//        List<Default_Text> texts = defaultTextMapper.findTextsBySentiment(sentiment);
//        assertNotNull(texts);
//        assertFalse(texts.isEmpty());
//        assertEquals(sentiment, texts.get(0).getSentiment());
//    }
}

