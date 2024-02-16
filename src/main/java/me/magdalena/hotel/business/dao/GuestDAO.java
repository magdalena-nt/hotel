package me.magdalena.hotel.business.dao;

import me.magdalena.hotel.domain.Guest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GuestDAO {

    List<Guest> findAll();

    Optional<Guest> findById(UUID id);

    void createGuest(Guest guest);
}
