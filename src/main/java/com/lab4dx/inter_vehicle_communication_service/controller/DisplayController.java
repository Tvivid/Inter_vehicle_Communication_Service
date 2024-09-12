package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import com.lab4dx.inter_vehicle_communication_service.service.CustomizingSettingService;
import com.lab4dx.inter_vehicle_communication_service.service.Default_SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DisplayController {

    @Autowired
    private Default_SettingService default_SettingService;

    @Autowired
    private CustomizingSettingService customizingSettingService;

    @GetMapping("/")
    public String home() {
        return "home_main";  // 홈 화면으로 이동 (home.html)
    }

    @GetMapping("/message_main")
    public String displayInfo(Model model) {
        String memberId="user1";//로그인 없이 임시로
        String positiveMessage= default_SettingService.getTextsBySentiment(memberId, "positive");
        String negativeMessage = default_SettingService.getTextsBySentiment(memberId,"negative");
        model.addAttribute("positiveMessage", positiveMessage);
        model.addAttribute("negativeMessage", negativeMessage);

        List<CustomizingSetting> customizingSettings = customizingSettingService.getSettingsByMember(memberId);

        System.out.println(customizingSettings);

        List<String> messages = customizingSettings.stream()
                .map(CustomizingSetting::getMessage)
                .collect(Collectors.toList());

        System.out.println(messages);

        List<String> emojiPaths = customizingSettings.stream()
                .map(setting -> "/images/emojis/" + setting.getEmojiId() + ".png")  // static 폴더 내에 이미지가 /images/emojis/ 경로에 있다고 가정
                .collect(Collectors.toList());


        model.addAttribute("customizingMessages", messages);
        model.addAttribute("emojiPaths", emojiPaths);


        return "message_main";  // 디스플레이 정보 화면 (display-info.html)
    }




}
