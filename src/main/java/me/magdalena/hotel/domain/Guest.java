package me.magdalena.hotel.domain;

import lombok.*;

import java.util.Set;
import java.util.UUID;

@With
@Value
@Builder
@EqualsAndHashCode(of = "email")
@ToString(of = {"name", "surname", "phone", "email"})
public class Guest {
    UUID id;
    String name;
    String surname;
    String phone;
    String email;
    Set<Reservation> reservations;
}
