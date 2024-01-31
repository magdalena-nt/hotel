package me.magdalena.hotel.domain;

import lombok.*;

import java.util.Set;
import java.util.UUID;

@With
@Value
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = {"name", "location", "floors", "contactInfo"})
public class Hotel {
    UUID id;
    String name;
    String location;
    Short floors;
    String contactInfo;
    Set<Room> rooms;
}
