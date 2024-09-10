package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import com.lab4dx.inter_vehicle_communication_service.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    // 회원 ID로 회원 정보 조회
    @GetMapping("/{memberId}")
    public Member getMember(@PathVariable String memberId) {
        return memberService.getMemberById(memberId);
    }

    // 새로운 회원 등록
    @PostMapping("/register")
    public String registerMember(@RequestBody Member member) {
        boolean success = memberService.registerMember(member);
        return success ? "회원 등록 성공" : "회원 등록 실패";
    }
}

