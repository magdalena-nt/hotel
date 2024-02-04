package me.magdalena.hotel.api.dto.mapper;

import me.magdalena.hotel.api.dto.HotelDTO;
import me.magdalena.hotel.domain.Hotel;
import org.springframework.stereotype.Component;

@Component
public class HotelMapper {

    public HotelDTO map(Hotel hotel) {
        if (hotel == null) {
            return null;
        }
        return HotelDTO.builder()
                       .id(hotel.getId())
                       .name(hotel.getName())
                       .location(hotel.getLocation())
                       .floors(hotel.getFloors())
                       .contactInfo(hotel.getContactInfo())
                       .build();
    }
}
