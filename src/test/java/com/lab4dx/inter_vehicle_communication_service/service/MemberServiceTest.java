package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import com.lab4dx.inter_vehicle_communication_service.mapper.MemberMapper;
import com.lab4dx.inter_vehicle_communication_service.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void testRegisterAndGetMember() {
        Member member = new Member();
        member.setMember_id("test123");
        member.setPassword("password");
        member.setUsername("Test User");
        member.setPhone_number("1234567890");

        // 회원 등록
        boolean registered = memberService.registerMember(member);
        assertTrue(registered);

        // 회원 조회
        Member retrievedMember = memberService.getMemberById("test123");
        assertNotNull(retrievedMember);
        assertEquals("test123", retrievedMember.getMember_id());
        assertEquals("Test User", retrievedMember.getUsername());
    }
}

