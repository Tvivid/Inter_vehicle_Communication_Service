package com.lab4dx.inter_vehicle_communication_service.controller;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import com.lab4dx.inter_vehicle_communication_service.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    // 새로운 회원 추가
    @PostMapping
    public ResponseEntity<String> addMember(@RequestBody Member member) {
        memberService.addMember(member);
        return ResponseEntity.ok("Member added successfully");
    }

    // 회원 정보 업데이트
    @PutMapping("/{memberId}")
    public ResponseEntity<String> updateMember(@PathVariable String memberId, @RequestBody Member member) {
        member.setMemberId(memberId);
        memberService.updateMember(member);
        return ResponseEntity.ok("Member updated successfully");
    }

    // 회원 ID로 회원 정보 조회
    @GetMapping("/{memberId}")
    public ResponseEntity<Member> getMemberById(@PathVariable String memberId) {
        Member member = memberService.getMemberById(memberId);
        return ResponseEntity.ok(member);
    }

    // 모든 회원 조회
    @GetMapping
    public ResponseEntity<List<Member>> getAllMembers() {
        List<Member> members = memberService.getAllMembers();
        return ResponseEntity.ok(members);
    }
}
