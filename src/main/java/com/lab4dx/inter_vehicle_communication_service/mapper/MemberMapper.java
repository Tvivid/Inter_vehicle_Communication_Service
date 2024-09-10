package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface MemberMapper {

    void insertMember(Member member);
    void updateMember(Member member);
    Member selectMemberById(String memberId);
    List<Member> getAllMembers();
}


