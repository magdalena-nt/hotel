package me.magdalena.hotel.infrastructure.database.repository.mapper;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.domain.Reservation;
import me.magdalena.hotel.infrastructure.database.entity.ReservationEntity;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReservationEntityMapper {

    private final RoomEntityMapper roomEntityMapper;
    private final GuestEntityMapper guestEntityMapper;

    public Reservation mapFromEntity(ReservationEntity reservationEntity) {
        return Reservation.builder()
                          .id(reservationEntity.getId())
                          .checkInDate(reservationEntity.getCheckInDate())
                          .checkOutDate(reservationEntity.getCheckOutDate())
                          .checkedIn(reservationEntity.getCheckedIn())
                          .room(roomEntityMapper.mapFromEntity(reservationEntity.getRoom()))
                          .guest(guestEntityMapper.mapFromEntity(reservationEntity.getGuest()))
                          .build();
    }

    public ReservationEntity mapToEntity(Reservation reservation) {
        return ReservationEntity.builder()
                                .id(reservation.getId())
                                .checkInDate(reservation.getCheckInDate())
                                .checkOutDate(reservation.getCheckOutDate())
                                .checkedIn(reservation.getCheckedIn())
                                .room(roomEntityMapper.mapToEntity(reservation.getRoom()))
                                .guest(guestEntityMapper.mapToEntity(reservation.getGuest()))
                                .build();
    }
}
