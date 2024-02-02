package me.magdalena.hotel.infrastructure.database.repository.mapper;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.domain.Room;
import me.magdalena.hotel.infrastructure.database.entity.RoomEntity;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RoomEntityMapper {

    private final HotelEntityMapper hotelEntityMapper;

    public Room mapFromEntity(RoomEntity roomEntity) {
        return Room.builder()
                   .id(roomEntity.getId())
                   .number(roomEntity.getNumber())
                   .type(roomEntity.getType())
                   .available(roomEntity.getAvailable())
                   .hotel(hotelEntityMapper.mapFromEntity(roomEntity.getHotel()))
                   .build();
    }

    public RoomEntity mapToEntity(Room room) {
        return RoomEntity.builder()
                         .id(room.getId())
                         .number(room.getNumber())
                         .type(room.getType())
                         .available(room.getAvailable())
                         .hotel(hotelEntityMapper.mapToEntity(room.getHotel()))
                         .build();
    }
}
