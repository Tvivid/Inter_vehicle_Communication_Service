package com.lab4dx.inter_vehicle_communication_service.mapper;



import com.lab4dx.inter_vehicle_communication_service.dto.Member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberMapperTest {


    @Autowired
    private MemberMapper memberMapper;

    
    @Test
    void getMemberByIdAndPassword() {

    }
    @Test
    void testFindById() {
        Member retrievedMember = memberMapper.findById("user123");
        assertNotNull(retrievedMember);
        assertEquals("user123", retrievedMember.getMember_id());
        assertEquals("Test User", retrievedMember.getUsername());
    }

    @Test
    void getAllMember() {
    }

    @Test
    void insertMember() {
        Member member = new Member();
        member.setMember_id("user1");
        member.setPassword("123");
        member.setUsername("lab");
        member.setPhone("010-1234-5678");

        memberMapper.insertMember(member);
    }

    @Test
    void updateMember() {
    }

    @Test
    void deleteMember() {
    }

}


