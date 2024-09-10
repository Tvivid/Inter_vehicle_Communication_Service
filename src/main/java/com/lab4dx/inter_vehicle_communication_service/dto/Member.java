package com.lab4dx.inter_vehicle_communication_service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
    private String memberId;  // 필드를 카멜 케이스로 변경
    private String password;
    private String username;
    private String phoneNumber;
}
