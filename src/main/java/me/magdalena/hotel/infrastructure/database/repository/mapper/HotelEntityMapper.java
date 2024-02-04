package me.magdalena.hotel.infrastructure.database.repository.mapper;

import me.magdalena.hotel.domain.Hotel;
import me.magdalena.hotel.infrastructure.database.entity.HotelEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class HotelEntityMapper {

    public Hotel mapFromEntity(HotelEntity hotelEntity) {
        if (Objects.isNull(hotelEntity)) return null;
        return Hotel.builder()
                    .id(hotelEntity.getId())
                    .name(hotelEntity.getName())
                    .location(hotelEntity.getLocation())
                    .floors(hotelEntity.getFloors())
                    .contactInfo(hotelEntity.getContactInfo())
                    .build();
    }

    public HotelEntity mapToEntity(Hotel hotel) {
        if (Objects.isNull(hotel)) return null;
        return HotelEntity.builder()
                          .id(hotel.getId())
                          .name(hotel.getName())
                          .location(hotel.getLocation())
                          .floors(hotel.getFloors())
                          .contactInfo(hotel.getContactInfo())
                          .build();
    }
}
