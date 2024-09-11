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
        return "home";  // 홈 화면으로 이동 (home.html)
    }

    @GetMapping("/display-info")
    public String displayInfo(Model model) {
        String memberId="user1";//로그인 없이 임시로
        String positiveMessages = default_SettingService.getTextsBySentiment(memberId, "positive");
        String negativeMessages = default_SettingService.getTextsBySentiment(memberId,"negative");
        model.addAttribute("positiveMessages", positiveMessages);
        model.addAttribute("negativeMessages", negativeMessages);

        List<CustomizingSetting> customizingSettings = customizingSettingService.getSettingsByMember(memberId);


        List<String> messages = customizingSettings.stream()
                .map(CustomizingSetting::getMessage)
                .collect(Collectors.toList());
        model.addAttribute("customizingMessages", messages);


        return "display-info";  // 디스플레이 정보 화면 (display-info.html)
    }


    // 3. 메시지 수정 화면으로 이동하는 요청 처리 (GET 요청)
    @GetMapping("/edit-message")
    public String editMessage() {
        return "edit-message";  // 메시지 수정 화면 (edit-message.html)
    }

}
