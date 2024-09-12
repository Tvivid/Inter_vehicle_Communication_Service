package com.lab4dx.inter_vehicle_communication_service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
public class CustomizingSetting {
    private String customizingId;
    private String memberId;
    private String emojiId;
    private String message;
    private String imagePath;
    private String emojiColor;

}
