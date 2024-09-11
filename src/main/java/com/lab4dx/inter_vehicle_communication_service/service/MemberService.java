package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import com.lab4dx.inter_vehicle_communication_service.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public interface MemberService {

    public void addMember(Member member);

    public void updateMember(Member member) ;

    public Member getMemberById(String memberId) ;

    public List<Member> getAllMembers() ;
}
