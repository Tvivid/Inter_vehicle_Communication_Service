package com.lab4dx.inter_vehicle_communication_service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
public class customizing_setting {
    private String member_id;
    private String emoji_id;
    private String emoji_color;
    private String message;
    private String image_path;
}
