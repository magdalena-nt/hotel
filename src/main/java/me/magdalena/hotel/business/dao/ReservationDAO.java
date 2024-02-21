package me.magdalena.hotel.business.dao;

import me.magdalena.hotel.domain.Reservation;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ReservationDAO {

    List<Reservation> findAll();

    Optional<Reservation> findById(UUID id);

    void createReservation(Reservation reservation);

}
