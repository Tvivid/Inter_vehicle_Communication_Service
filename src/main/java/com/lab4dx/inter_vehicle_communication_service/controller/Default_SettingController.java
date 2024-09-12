package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import com.lab4dx.inter_vehicle_communication_service.dto.Default_Setting;
import com.lab4dx.inter_vehicle_communication_service.dto.Default_Text;
import com.lab4dx.inter_vehicle_communication_service.service.Default_SettingService;
import com.lab4dx.inter_vehicle_communication_service.service.Default_TextService;
import com.lab4dx.inter_vehicle_communication_service.service.Default_TextServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/message_default")
public class Default_SettingController {

    @Autowired
    private Default_SettingService default_SettingService;

    @Autowired
    private Default_TextService default_TextService;

    // 감정에 따라서 선택할 수 있는 텍스트를 보여줌
    @GetMapping
    public String selectEmotion(@RequestParam String sentiment, Model model) {

        List<Default_Text> default_texts= default_TextService.getTextsBySentiment(sentiment);


        model.addAttribute("messages", default_texts);
        model.addAttribute("sentiment", sentiment);

        return "message_default"; // HTML 템플릿 파일 이름
    }

    // 사용자가 선택한 감정으로 설정을 업데이트
    @PostMapping("/updateEmotionSetting")
    public String updateEmotionSetting(Default_Setting defaultSetting, RedirectAttributes redirectAttributes) {
        defaultSetting.setMember_id("user1");
        boolean success = default_SettingService.updateUserSetting(defaultSetting);
        if (success) {
            redirectAttributes.addFlashAttribute("msg", "감정 설정이 성공적으로 변경되었습니다!");
        } else {
            redirectAttributes.addFlashAttribute("msg", "감정 설정 변경에 실패했습니다.");
        }
        return "redirect:/message_main"; // 성공 후 리디렉션할 URL
    }
}

