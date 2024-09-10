package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    // 회원 정보 삽입 (Create)
    int insertMember(Member member);

    // 회원 정보 조회 (Read)
    Member selectMemberById(@Param("member_id") String memberId);

    // 회원 정보 업데이트 (Update)
    int updateMember(Member member);

    // 회원 정보 삭제 (Delete)
    int deleteMember(@Param("member_id") String memberId);
}



