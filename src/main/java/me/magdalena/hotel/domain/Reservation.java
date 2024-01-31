package me.magdalena.hotel.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@With
@Value
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = {"id", "checkInDate", "checkOutDate", "checkedIn", "room", "guest"})
public class Reservation {
    UUID id;
    LocalDate checkInDate;
    LocalDate checkOutDate;
    Boolean checkedIn;
    Room room;
    Guest guest;
}
