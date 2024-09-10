package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface MemberMapper {
    Member getMemberByIdAndPassword(String memberId, String password);
    Member findById(String memberId);
    List<Member> getAllMember();
    void insertMember(Member member);
    void updateMember(Member member);
    void deleteMember(int memberId);
}


