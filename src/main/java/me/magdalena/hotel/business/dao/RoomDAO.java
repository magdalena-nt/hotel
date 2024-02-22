package me.magdalena.hotel.business.dao;

import me.magdalena.hotel.domain.Room;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoomDAO {

    List<Room> findAll();

    Optional<Room> findById(UUID id);

}
