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
public class RoomDTO {

    private UUID id;
    private String number;
    private String type;
    private Boolean available;
    private UUID hotelId;
}
