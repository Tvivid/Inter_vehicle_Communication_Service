package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    // 회원 정보 삽입 (Create)
//    @Insert("INSERT INTO Member (member_id, password, username, email, phone) " +
//            "VALUES (#{member_id}, #{password}, #{username}, #{email}, #{phone})")
    int insertMember(Member member);

    // 회원 정보 조회 (Read)
//    @Select("SELECT * FROM Member WHERE member_id = #{member_id}")
    Member selectMemberById(@Param("member_id") String memberId);

    // 회원 정보 업데이트 (Update)
//    @Update("UPDATE Member SET password = #{password}, username = #{username}, email = #{email}, phone = #{phone} " +
//            "WHERE member_id = #{member_id}")
    int updateMember(Member member);

    // 회원 정보 삭제 (Delete)
//    @Delete("DELETE FROM Member WHERE member_id = #{member_id}")
    int deleteMember(@Param("member_id") String memberId);
}



