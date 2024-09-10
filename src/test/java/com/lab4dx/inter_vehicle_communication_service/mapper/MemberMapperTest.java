package com.lab4dx.inter_vehicle_communication_service.mapper;

import com.lab4dx.inter_vehicle_communication_service.dto.Member;
import com.lab4dx.inter_vehicle_communication_service.dto.customizing_setting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MemberMapperTest {

    @Autowired
    MemberMapper memberMapper;

    @Test
    void insertMember() {
        Member mem = new Member();
        mem.setMember_id("qwer");
        mem.setPassword("1234");
        mem.setUsername("user2");
        mem.setPhone("010-1234-1234");

        memberMapper.insertMember(mem);


    }

    @Test
    void selectMemberById() {
    }

    @Test
    void updateMember() {
    }

    @Test
    void deleteMember() {
    }
}