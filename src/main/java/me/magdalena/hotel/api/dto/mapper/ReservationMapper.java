package me.magdalena.hotel.api.dto.mapper;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.api.dto.ReservationDTO;
import me.magdalena.hotel.business.GuestService;
import me.magdalena.hotel.business.RoomService;
import me.magdalena.hotel.domain.Reservation;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReservationMapper {

    private final RoomMapper roomMapper;
    private final GuestMapper guestMapper;
    private final RoomService roomService;
    private final GuestService guestService;

    public ReservationDTO map(Reservation reservation) {
        if (reservation == null) {
            return null;
        }
        return ReservationDTO.builder()
                             .id(reservation.getId())
                             .checkInDate(reservation.getCheckInDate())
                             .checkOutDate(reservation.getCheckOutDate())
                             .checkedIn(reservation.getCheckedIn())
                             .roomId((reservation.getRoom()
                                                 .getId()))
                             .guestId(reservation.getGuest()
                                                 .getId())
                             .build();
    }

    public Reservation map(ReservationDTO reservationDTO) {
        if (reservationDTO == null) {
            return null;
        }
        return Reservation.builder()
                          .id(reservationDTO.getId())
                          .checkInDate(reservationDTO.getCheckInDate())
                          .checkOutDate(reservationDTO.getCheckOutDate())
                          .checkedIn(reservationDTO.getCheckedIn())
                          .room(roomService.findById(reservationDTO.getRoomId()))
                          .guest(guestService.findById(reservationDTO.getGuestId()))
                          .build();
    }
}
