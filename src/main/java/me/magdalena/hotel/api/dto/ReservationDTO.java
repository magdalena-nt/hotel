package me.magdalena.hotel.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.magdalena.hotel.domain.Guest;
import me.magdalena.hotel.domain.Room;

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
    private GuestDTO guestDTO;
    private RoomDTO roomDTO;
}
