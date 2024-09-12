package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import com.lab4dx.inter_vehicle_communication_service.service.CustomizingSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class DisplayMessageController {

    @Autowired
    private CustomizingSettingService customizingSettingService;

    @GetMapping("/display")
    public String displayMessage(@RequestParam("message") String message, Model model) {
        // 받은 메시지를 모델에 담아서 display.html로 전달
        model.addAttribute("message", message);
        return "display";
    }

    @GetMapping("/display-image")
    public String displayImage(@RequestParam("customizingId") String customizingId, Model model) {

        String memberId = "user1";
        CustomizingSetting customizingSetting = customizingSettingService.getSettingByIdAndMemberId(customizingId, memberId);

        model.addAttribute("customizingSetting", customizingSetting);
        return "image_display";
    }


}
