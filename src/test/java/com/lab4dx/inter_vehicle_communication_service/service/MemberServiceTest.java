package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import com.lab4dx.inter_vehicle_communication_service.mapper.MemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest

public class MemberServiceTest {

    @Autowired
    private MemberService memberService;


    @Test
    public void testGetMemberById() {
        // Given: 이미 user1이 삽입된 상태

        // When: 해당 memberId로 회원을 조회
        Member member = memberService.getMemberById("user1");

        // Then: 조회된 회원 정보가 올바른지 확인
        assertThat(member).isNotNull();
        assertThat(member.getUsername()).isEqualTo("JohnDoe");
    }
}

