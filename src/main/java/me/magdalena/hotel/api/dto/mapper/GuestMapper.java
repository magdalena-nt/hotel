package me.magdalena.hotel.api.dto.mapper;

import me.magdalena.hotel.api.dto.GuestDTO;
import me.magdalena.hotel.domain.Guest;
import org.springframework.stereotype.Component;

@Component
public class GuestMapper {

    public GuestDTO map(Guest guest) {
        if (guest == null) {
            return null;
        }
        return GuestDTO.builder()
                       .id(guest.getId())
                       .name(guest.getName())
                       .surname(guest.getSurname())
                       .phone(guest.getPhone())
                       .email(guest.getEmail())
                       .build();
    }

    public Guest map(GuestDTO guestDTO) {
        if (guestDTO == null) {
            return null;
        }
        return Guest.builder()
                    .id(guestDTO.getId())
                    .name(guestDTO.getName())
                    .surname(guestDTO.getSurname())
                    .phone(guestDTO.getPhone())
                    .email(guestDTO.getEmail())
                    .build();
    }
}
