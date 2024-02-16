package me.magdalena.hotel.api.dto.mapper;

import me.magdalena.hotel.api.dto.RoomDTO;
import me.magdalena.hotel.domain.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    public RoomDTO map(Room room) {
        if (room == null) {
            return null;
        }
        return RoomDTO.builder()
                      .id(room.getId())
                      .number(room.getNumber())
                      .type(room.getType())
                      .available(room.getAvailable())
                      .hotelId(room.getHotel()
                                   .getId())
                      .build();
    }
}
