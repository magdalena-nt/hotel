package me.magdalena.hotel.infrastructure.database.repository.mapper;

import me.magdalena.hotel.domain.Guest;
import me.magdalena.hotel.infrastructure.database.entity.GuestEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class GuestEntityMapper {

    public Guest mapFromEntity(GuestEntity guestEntity) {
        if (guestEntity == null) {
            return null;
        }
        Guest.GuestBuilder guestBuilder = Guest.builder();
        return guestBuilder
                    .id(guestEntity.getId())
                    .name(guestEntity.getName())
                    .surname(guestEntity.getSurname())
                    .phone(guestEntity.getPhone())
                    .email(guestEntity.getEmail())
                    .build();
    }

    public GuestEntity mapToEntity(Guest guest) {
        if (Objects.isNull(guest)) {
            return null;
        }
        return GuestEntity.builder()
                          .id(guest.getId())
                          .name(guest.getName())
                          .surname(guest.getSurname())
                          .phone(guest.getPhone())
                          .email(guest.getEmail())
                          .build();
    }
}
