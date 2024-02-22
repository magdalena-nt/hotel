package me.magdalena.hotel.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {

    private UUID id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Boolean checkedIn;
    private UUID guestId;
    private UUID roomId;
}
