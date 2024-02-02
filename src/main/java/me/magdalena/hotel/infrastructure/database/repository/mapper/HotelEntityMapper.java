package me.magdalena.hotel.infrastructure.database.repository.mapper;

import me.magdalena.hotel.domain.Hotel;
import me.magdalena.hotel.infrastructure.database.entity.HotelEntity;
import org.springframework.stereotype.Component;

@Component
public class HotelEntityMapper {

    public Hotel mapFromEntity(HotelEntity hotelEntity) {
        return Hotel.builder()
                    .id(hotelEntity.getId())
                    .name(hotelEntity.getName())
                    .location(hotelEntity.getLocation())
                    .floors(hotelEntity.getFloors())
                    .contactInfo(hotelEntity.getContactInfo())
                    .build();
    }

    public HotelEntity mapToEntity(Hotel hotel) {
        return HotelEntity.builder()
                          .id(hotel.getId())
                          .name(hotel.getName())
                          .location(hotel.getLocation())
                          .floors(hotel.getFloors())
                          .contactInfo(hotel.getContactInfo())
                          .build();
    }
}
