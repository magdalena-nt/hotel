package me.magdalena.hotel.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelDTO {

    private UUID id;
    private String name;
    private String location;
    private Short floors;
    private String contactInfo;
}
