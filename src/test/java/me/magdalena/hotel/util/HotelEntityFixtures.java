package me.magdalena.hotel.util;

import me.magdalena.hotel.infrastructure.database.entity.HotelEntity;
import me.magdalena.hotel.infrastructure.database.entity.RoomEntity;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class HotelEntityFixtures {

    public static HotelEntity createHotelEntityOne() {
        Set<RoomEntity> rooms = new HashSet<>();
        // Optionally add RoomEntity objects to the rooms set
        // rooms.add(new RoomEntity(...));
        
        return HotelEntity.builder()
                .id(UUID.randomUUID())
                .name("Hotel Sunshine")
                .location("123 Sunny Street, Sunville")
                .floors((short) 5)
                .contactInfo("contact@sunshine.com")
                .rooms(rooms)
                .build();
    }

    public static HotelEntity createHotelEntityTwo() {
        Set<RoomEntity> rooms = new HashSet<>();
        // Optionally add RoomEntity objects to the rooms set
        // rooms.add(new RoomEntity(...));
        
        return HotelEntity.builder()
                .id(UUID.randomUUID())
                .name("Moonlight Inn")
                .location("321 Moon Road, Moonville")
                .floors((short) 3)
                .contactInfo("info@moonlightinn.com")
                .rooms(rooms)
                .build();
    }
}
