package com.lab4dx.inter_vehicle_communication_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayController {

    @GetMapping("/")
    public String home() {
        return "home";  // 홈 화면으로 이동 (home.html)
    }

    @GetMapping("/display-info")
    public String displayInfo() {
        return "display-info";  // 디스플레이 정보 화면 (display-info.html)
    }


    // 3. 메시지 수정 화면으로 이동하는 요청 처리 (GET 요청)
    @GetMapping("/edit-message")
    public String editMessage() {
        return "edit-message";  // 메시지 수정 화면 (edit-message.html)
    }

}
