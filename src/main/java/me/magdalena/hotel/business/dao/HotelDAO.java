package me.magdalena.hotel.business.dao;

import me.magdalena.hotel.domain.Hotel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HotelDAO {

    List<Hotel> findAll();

    Optional<Hotel> findById(UUID id);

}
