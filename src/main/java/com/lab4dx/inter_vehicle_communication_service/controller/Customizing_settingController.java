//package com.lab4dx.inter_vehicle_communication_service.controller;
//
//import com.lab4dx.inter_vehicle_communication_service.dto.customizing_setting;
//import com.lab4dx.inter_vehicle_communication_service.service.Customizing_settingService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("")
//public class Customizing_settingController {
//
//    @Autowired
//    private Customizing_settingService customizing_settingService;
//
//    @GetMapping("")
//    public ResponseEntity<String> updateIconSetting(@RequestParam("memberId") String memberId,
//                                                    @RequestParam("emojiId") String emojiId,
//                                                    @RequestParam("emojiColor") String emojiColor) {
//
//        // 1. 먼저 현재 설정된 아이콘 정보를 가져와서
//        customizing_setting currentSetting = customizing_settingService.getIconSettingByMemberId(memberId);
//
//        // 2. 현재 설정과 새로 전달된 값이 같은지 확인
//        boolean isChanged = false;
//
//        if (!currentSetting.getEmoji_id().equals(emojiId)) {
//            isChanged = true;
//        }
//        if (!currentSetting.getEmoji_color().equals(emojiColor)) {
//            isChanged = true;
//        }
//
//        // 3. 변경 사항이 있는 경우에만 업데이트 수행
//        if (isChanged) {
//            boolean isUpdated = customizing_settingService.updateIconSetting(memberId, emojiId, emojiColor);
//            if (isUpdated) {
//                return ResponseEntity.ok("아이콘 설정이 성공적으로 업데이트되었습니다.");
//            } else {
//                return ResponseEntity.status(500).body("업데이트에 실패했습니다.");
//            }
//        } else {
//            // 4. 변경 사항이 없을 경우, 기존 값을 유지하고 설정값 변경 페이지로 이동
//            // 설정 페이지로 이동 (보통 클라이언트 측에서 처리하는 경우가 많으므로, 메시지를 반환)
//            return ResponseEntity.ok("변경 사항이 없습니다. 기존 설정을 유지합니다.");
//        }
//    }
//
//    // 특정 사용자의 아이콘 색상과 모양을 업데이트
//    @PutMapping("")
//    public ResponseEntity<String> updateIconSetting(@RequestParam("memberId") String memberId,
//                                                    @RequestParam("emojiId") String emojiId,
//                                                    @RequestParam("emojiColor") String emojiColor) {
//        Customizing_settingService customizingSettingService = null;
//        boolean isUpdated = customizingSettingService.updateIconSetting(memberId, emojiId, emojiColor);
//        if (isUpdated) {
//            return ResponseEntity.ok("아이콘 설정이 성공적으로 업데이트되었습니다.");
//        } else {
//            return ResponseEntity.status(500).body("업데이트에 실패했습니다.");
//        }
//    }
//}





//package com.lab4dx.inter_vehicle_communication_service.controller;
//
//import com.lab4dx.inter_vehicle_communication_service.dto.customizing_setting;
//import com.lab4dx.inter_vehicle_communication_service.service.Customizing_settingService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller  // Spring MVC 컨트롤러로 선언
//@RequestMapping("/customizing-setting")  // 기본 경로 설정 (이 컨트롤러가 "/customizing-setting" 경로로 들어오는 요청을 처리)
//public class Customizing_settingController {
//
//    @Autowired
//    private Customizing_settingService customizing_settingService;  // 서비스 객체를 자동으로 주입 받음. 이 서비스는 실제로 로직을 처리함.
//
//    // 특정 사용자의 아이콘 설정을 조회 (GET 요청)
//    // 이 메서드는 사용자의 현재 아이콘 설정을 조회하기 위한 메서드임
//    @GetMapping("/{memberId}")
//    public ResponseEntity<customizing_setting> getIconSettingByMemberId(@PathVariable("memberId") String memberId) {
//        // 1. 서비스에서 해당 사용자(memberId)의 아이콘 설정 정보를 가져옴.
//        customizing_setting currentSetting = customizing_settingService.getIconSettingByMemberId(memberId);
//
//        // 2. 만약 가져온 설정이 있다면 (null이 아니면) OK 상태 코드와 함께 데이터를 반환.
//        if (currentSetting != null) {
//            return ResponseEntity.ok(currentSetting);  // 200 OK와 함께 아이콘 설정 데이터를 반환
//        } else {
//            // 3. 설정이 없다면 404 Not Found 상태 코드를 반환 (설정을 찾을 수 없을 때).
//            return ResponseEntity.notFound().build();  // 404 Not Found
//        }
//    }
//
//    // 특정 사용자의 아이콘 색상과 모양을 업데이트하는 메서드 (PUT 요청)
//    // 이 메서드는 사용자가 새로운 아이콘 정보 (emojiId, emojiColor)를 입력했을 때, 그 값을 업데이트해 주는 역할을 해.
//    @PutMapping("/update")
//    public ResponseEntity<String> updateIconSetting(@RequestParam("memberId") String memberId,
//                                                    @RequestParam("emojiId") String emojiId,
//                                                    @RequestParam("emojiColor") String emojiColor) {
//        // 1. 먼저 현재 사용자의 아이콘 설정 정보를 가져옴.
//        customizing_setting currentSetting = customizing_settingService.getIconSettingByMemberId(memberId);
//
//        // 2. 가져온 현재 설정과 새로 입력된 값이 같은지 비교함.
//        // 만약 모양(emojiId)이나 색상(emojiColor) 중 하나라도 다른 값이 있다면 변경된 것이라고 판단함.
//        boolean isChanged = false;  // 값이 변경되었는지 여부를 체크하기 위한 플래그
//
//        // 현재 아이콘 ID와 새로운 아이콘 ID가 다른지 확인
//        if (!currentSetting.getEmoji_id().equals(emojiId)) {
//            isChanged = true;  // 아이콘 ID가 다르면 변경된 것으로 설정
//        }
//
//        // 현재 아이콘 색상과 새로운 아이콘 색상이 다른지 확인
//        if (!currentSetting.getEmoji_color().equals(emojiColor)) {
//            isChanged = true;  // 아이콘 색상이 다르면 변경된 것으로 설정
//        }
//
//        // 3. 값이 변경된 경우에만 업데이트를 진행함.
//        if (isChanged) {
//            // 서비스로 값을 넘겨서 업데이트 실행. 업데이트가 성공하면 true를 반환.
//            boolean isUpdated = customizing_settingService.updateIconSetting(memberId, emojiId, emojiColor);
//
//            // 업데이트가 성공했으면 성공 메시지를 반환
//            if (isUpdated) {
//                return ResponseEntity.ok("아이콘 설정이 성공적으로 업데이트되었습니다.");  // 200 OK와 함께 성공 메시지 반환
//            } else {
//                // 만약 업데이트가 실패하면 서버 오류로 간주하고 500 상태 코드를 반환.
//                return ResponseEntity.status(500).body("업데이트에 실패했습니다.");  // 500 Internal Server Error
//            }
//        } else {
//            // 4. 값이 변경되지 않았다면, 변경 사항이 없다고 알려줌.
//            // 이 경우, 사용자는 "변경 사항이 없습니다"라는 메시지를 받을 거야.
//            return ResponseEntity.ok("변경 사항이 없습니다. 기존 설정을 유지합니다.");  // 200 OK와 함께 "변경 사항 없음" 메시지 반환
//        }
//    }
//}






package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.service.Customizing_settingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller  // Spring MVC 컨트롤러로 선언
@RequestMapping("/customizing-setting")  // 기본 경로 설정 (이 컨트롤러가 "/customizing-setting" 경로로 들어오는 요청을 처리)
public class Customizing_settingController {

    @Autowired
    private Customizing_settingService customizing_settingService;  // 서비스 객체를 자동으로 주입 받음. 이 서비스는 실제로 로직을 처리함.

    // 특정 사용자의 아이콘 설정을 조회 (GET 요청)
    @GetMapping("/{memberId}")
    public String getIconSettingByMemberId(@PathVariable("memberId") String memberId, RedirectAttributes redirectAttributes) {
        // 1. 서비스에서 해당 사용자(memberId)의 아이콘 설정 정보를 가져옴.
        CustomizingSetting currentSetting = customizing_settingService.getIconSettingByMemberId(memberId);

        // 2. 만약 가져온 설정이 없다면 404 Not Found 상태 코드를 반환하는 대신, 에러 메시지를 전달하고 아이콘 설정 페이지로 돌아감
        if (currentSetting == null) {
            redirectAttributes.addFlashAttribute("msg", "아이콘 설정을 찾을 수 없습니다.");
            return "redirect:/customizing-setting";  // 아이콘 설정 페이지로 리다이렉트
        }

        // 아이콘 설정 페이지를 표시 (여기서 페이지 렌더링 로직을 추가해야 할 수 있음)
        return "customizing-setting-page";  // 뷰 파일 이름을 반환 (예: customizing-setting-page.html)
    }

    // 특정 사용자의 아이콘 색상과 모양을 업데이트하는 메서드 (POST 요청으로 바꿈)
    @PostMapping("/update")
    public String updateIconSetting(@RequestParam("memberId") String memberId,
                                    @RequestParam("emojiId") String emojiId,
                                    @RequestParam("emojiColor") String emojiColor,
                                    RedirectAttributes redirectAttributes) {
        // 1. 먼저 현재 사용자의 아이콘 설정 정보를 가져옴.
        CustomizingSetting currentSetting = customizing_settingService.getIconSettingByMemberId(memberId);

        // 2. 가져온 현재 설정과 새로 입력된 값이 같은지 비교함.
        boolean isChanged = false;  // 값이 변경되었는지 여부를 체크하기 위한 플래그

        // 현재 아이콘 ID와 새로운 아이콘 ID가 다른지 확인
        if (!currentSetting.getEmoji_id().equals(emojiId)) {
            isChanged = true;  // 아이콘 ID가 다르면 변경된 것으로 설정
        }

        // 현재 아이콘 색상과 새로운 아이콘 색상이 다른지 확인
        if (!currentSetting.getEmoji_color().equals(emojiColor)) {
            isChanged = true;  // 아이콘 색상이 다르면 변경된 것으로 설정
        }

        // 3. 값이 변경된 경우에만 업데이트를 진행함.
        if (isChanged) {
            // 서비스로 값을 넘겨서 업데이트 실행. 업데이트가 성공하면 true를 반환.
            boolean isUpdated = customizing_settingService.updateIconSetting(memberId, emojiId, emojiColor);

            // 업데이트가 성공했으면 성공 메시지를 전달하고 메인 페이지로 리다이렉트
            if (isUpdated) {
                redirectAttributes.addFlashAttribute("msg", "아이콘 설정이 성공적으로 업데이트되었습니다.");
                return "redirect:/";  // 메인 페이지로 리다이렉트
            } else {
                // 업데이트가 실패하면 아이콘 설정 페이지로 돌아가고 메시지를 전달
                redirectAttributes.addFlashAttribute("msg", "아이콘 설정 업데이트에 실패했습니다.");
                return "redirect:/customizing-setting";  // 아이콘 설정 페이지로 돌아감
            }
        } else {
            // 4. 값이 변경되지 않았다면, 변경 사항이 없다는 메시지와 함께 아이콘 설정 페이지로 돌아감.
            redirectAttributes.addFlashAttribute("msg", "변경 사항이 없습니다.");
            return "redirect:/customizing-setting";  // 아이콘 설정 페이지로 리다이렉트
        }
    }
}


