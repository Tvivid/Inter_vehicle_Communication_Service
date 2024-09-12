package com.lab4dx.inter_vehicle_communication_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/display")
public class DisplayMessageController {
    @GetMapping
    public String displayMessage(@RequestParam("message") String message, Model model) {
        // 받은 메시지를 모델에 담아서 display.html로 전달
        model.addAttribute("message", message);
        return "display";
    }
}
