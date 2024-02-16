package me.magdalena.hotel.api.dto.mapper;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.api.dto.ReservationDTO;
import me.magdalena.hotel.domain.Reservation;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReservationMapper {

    private final RoomMapper roomMapper;
    private final GuestMapper guestMapper;

    public ReservationDTO map(Reservation reservation) {
        if (reservation == null) {
            return null;
        }
        return ReservationDTO.builder()
                             .id(reservation.getId())
                             .checkInDate(reservation.getCheckInDate())
                             .checkOutDate(reservation.getCheckOutDate())
                             .checkedIn(reservation.getCheckedIn())
                             .roomDTO(roomMapper.map(reservation.getRoom()))
                             .guestDTO(guestMapper.map(reservation.getGuest()))
                             .build();
    }
}
