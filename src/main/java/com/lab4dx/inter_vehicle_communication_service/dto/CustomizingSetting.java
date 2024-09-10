package com.lab4dx.inter_vehicle_communication_service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
public class CustomizingSetting {
    private String memberId;
    private int emojiId;
    private String message;
    private String imagePath;
    private String emojiColor;

}
