package me.magdalena.hotel.domain;

import lombok.*;

import java.util.UUID;

@With
@Value
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = {"number", "type", "available"})
public class Room {
    UUID id;
    String number;
    String type;
    Boolean available;
    Hotel hotel;
}
