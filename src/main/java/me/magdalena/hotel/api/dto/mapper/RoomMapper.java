package me.magdalena.hotel.api.dto.mapper;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.api.dto.RoomDTO;
import me.magdalena.hotel.business.HotelService;
import me.magdalena.hotel.domain.Room;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RoomMapper {

    private final HotelService hotelService;

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

    public Room map(RoomDTO roomDTO) {
        if (roomDTO == null) {
            return null;
        }
        return Room.builder()
                   .id(roomDTO.getId())
                   .number(roomDTO.getNumber())
                   .type(roomDTO.getType())
                   .available(roomDTO.getAvailable())
                   .hotel(hotelService.findById(roomDTO.getHotelId()))
                   .build();
    }
}
