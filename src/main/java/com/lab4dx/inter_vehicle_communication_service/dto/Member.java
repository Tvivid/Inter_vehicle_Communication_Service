package com.lab4dx.inter_vehicle_communication_service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
public class Member {
    private String member_id;
    private String password;
    private String username;
    private String phone_number;
}

