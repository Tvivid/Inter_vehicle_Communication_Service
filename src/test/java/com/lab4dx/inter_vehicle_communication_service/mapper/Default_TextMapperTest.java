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
//        default_text.setTextId("text3");
//        default_text.setSentiment("positive");
//        default_text.setText("안전운전하세요~");
//        defaultTextMapper.insertDefaultText(default_text);
//
//        default_text.setTextId("text1");
//        default_text.setSentiment("positive");
//        default_text.setText("Thank you you");
//        defaultTextMapper.insertDefaultText(default_text);
//
//        default_text.setTextId("text2");
//        default_text.setSentiment("positive");
//        default_text.setText("감사합니다");
//        defaultTextMapper.insertDefaultText(default_text);
//
//
//        default_text.setTextId("text4");
//        default_text.setSentiment("negative");
//        default_text.setText("Stop!!!");
//        defaultTextMapper.insertDefaultText(default_text);

        default_text.setTextId("text5");
        default_text.setSentiment("positive");
        default_text.setText("복 받으실 거예요!");
        defaultTextMapper.insertDefaultText(default_text);

        default_text.setTextId("text6");
        default_text.setSentiment("positive");
        default_text.setText("안전운전 하세요");
        defaultTextMapper.insertDefaultText(default_text);

        default_text.setTextId("text7");
        default_text.setSentiment("positive");
        default_text.setText("덕분에 무사히 갑니다");
        defaultTextMapper.insertDefaultText(default_text);

        default_text.setTextId("text8");
        default_text.setSentiment("negative");
        default_text.setText("조심운전 해주세요");
        defaultTextMapper.insertDefaultText(default_text);

        default_text.setTextId("text9");
        default_text.setSentiment("negative");
        default_text.setText("상향등 꺼주세요");
        defaultTextMapper.insertDefaultText(default_text);

        default_text.setTextId("text10");
        default_text.setSentiment("negative");
        default_text.setText("라이트가 너무 밝아요");
        defaultTextMapper.insertDefaultText(default_text);

        default_text.setTextId("text11");
        default_text.setSentiment("negative");
        default_text.setText("차선에서 자주 이탈합니다");
        defaultTextMapper.insertDefaultText(default_text);

        default_text.setTextId("text12");
        default_text.setSentiment("negative");
        default_text.setText("깜빡이 켜주세요");
        defaultTextMapper.insertDefaultText(default_text);

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

