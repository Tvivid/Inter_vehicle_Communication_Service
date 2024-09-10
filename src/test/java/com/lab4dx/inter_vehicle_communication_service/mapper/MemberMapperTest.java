package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testInsertMember() {
        // Given
        Member member = new Member();
        member.setMemberId("user1");
        member.setPassword("password123");
        member.setUsername("JohnDoe");
        member.setPhoneNumber("01012345678");

        // When
        memberMapper.insertMember(member);

        // Then
        Member insertedMember = memberMapper.selectMemberById("user1");
        assertThat(insertedMember).isNotNull();
        assertThat(insertedMember.getUsername()).isEqualTo("JohnDoe");
    }
}
