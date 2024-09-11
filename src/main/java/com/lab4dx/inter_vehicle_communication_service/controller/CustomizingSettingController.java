package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;


import com.lab4dx.inter_vehicle_communication_service.mapper.CustomizingSettingMapper;
import com.lab4dx.inter_vehicle_communication_service.service.CustomizingSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/customizing")
public class CustomizingSettingController {




    private static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/uploads";

    @Autowired
    private CustomizingSettingMapper customizingSettingMapper;

    @Autowired
    private CustomizingSettingService customizingSettingService;

    @GetMapping("/")
    public String customizingSetting(Model model) {

        return "customizingSetting";  // 메시지 수정 화면 (edit-message.html)
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("emojiId") String emojiId,
                                              @RequestParam("message") String message,
                                              @RequestParam("emojiColor") String emojiColor,
                                              @RequestParam("image") MultipartFile file) throws IOException {

        // 이미지 파일을 서버에 저장
        String fileName = file.getOriginalFilename();
        Path filePath = Paths.get(UPLOAD_DIRECTORY, fileName);
        Files.copy(file.getInputStream(), filePath);

        // 이미지 경로를 DB에 저장할 CustomizingSetting 객체 생성
        CustomizingSetting setting = new CustomizingSetting();
        setting.setMemberId("user1");
        setting.setEmojiId(emojiId);
        setting.setMessage(message);
        setting.setEmojiColor(emojiColor);
        setting.setImagePath(filePath.toString());  // 이미지 경로를 설정

        // DB에 삽입
        customizingSettingService.createSettings(setting);

        return ResponseEntity.ok("File uploaded successfully: " + fileName);
    }

//    @PostMapping("/update")
//    public String updateIconSetting(@RequestParam("memberId") String memberId,
//                                    @RequestParam("emojiId") String emojiId,
//                                    @RequestParam("emojiColor") String emojiColor,
//                                    RedirectAttributes redirectAttributes) {
//        // 1. 먼저 현재 사용자의 아이콘 설정 정보를 가져옴.
//        CustomizingSetting currentSetting = customizingSettingService.getIconSettingByMemberId(memberId);
//
//        // 2. 예외 처리를 추가 (추가된 부분)
//        if (currentSetting == null) {
//            redirectAttributes.addFlashAttribute("msg", "아이콘 설정을 찾을 수 없습니다.");
//            return "redirect:/customizing-setting";  // 아이콘 설정 페이지로 리다이렉트
//        }
//
//        // 3. 가져온 현재 설정과 새로 입력된 값이 같은지 비교함.
//        boolean isChanged = false;  // 값이 변경되었는지 여부를 체크하기 위한 플래그
//
//        // 현재 아이콘 ID와 새로운 아이콘 ID가 다른지 확인
//        if (!currentSetting.getEmojiId().equals(emojiId)) {  // getEmoji_id -> getEmojiId로 수정
//            isChanged = true;  // 아이콘 ID가 다르면 변경된 것으로 설정
//        }
//
//        // 현재 아이콘 색상과 새로운 아이콘 색상이 다른지 확인
//        if (!currentSetting.getEmojiColor().equals(emojiColor)) {  // getEmoji_color -> getEmojiColor로 수정
//            isChanged = true;  // 아이콘 색상이 다르면 변경된 것으로 설정
//        }
//
//        // 4. 값이 변경된 경우에만 업데이트를 진행함.
//        if (isChanged) {
//            // 서비스로 값을 넘겨서 업데이트 실행. 업데이트가 성공하면 true를 반환.
//            boolean isUpdated = customizingSettingService.updateIconSetting(memberId, emojiId, emojiColor);
//
//            // 업데이트가 성공했으면 성공 메시지를 전달하고 메인 페이지로 리다이렉트
//            if (isUpdated) {
//                redirectAttributes.addFlashAttribute("msg", "아이콘 설정이 성공적으로 업데이트되었습니다.");
//                return "redirect:/";  // 메인 페이지로 리다이렉트
//            } else {
//                // 업데이트가 실패하면 아이콘 설정 페이지로 돌아가고 메시지를 전달
//                redirectAttributes.addFlashAttribute("msg", "아이콘 설정 업데이트에 실패했습니다.");
//                return "redirect:/customizing-setting";  // 아이콘 설정 페이지로 돌아감
//            }
//        } else {
//            // 5. 값이 변경되지 않았다면, 변경 사항이 없다는 메시지와 함께 아이콘 설정 페이지로 돌아감.
//            redirectAttributes.addFlashAttribute("msg", "변경 사항이 없습니다.");
//            return "redirect:/customizing-setting";  // 아이콘 설정 페이지로 리다이렉트
//        }
//    }



}
