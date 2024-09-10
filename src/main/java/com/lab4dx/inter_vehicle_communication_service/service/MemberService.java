package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import com.lab4dx.inter_vehicle_communication_service.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    // 회원 ID로 회원 정보 조회
    public Member getMemberById(String memberId) {
        return memberMapper.findById(memberId);
    }

    // 새로운 회원 등록
    public boolean registerMember(Member member) {
        return memberMapper.insertMember(member) > 0;
    }
}

