package me.magdalena.hotel.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.business.dao.ReservationDAO;
import me.magdalena.hotel.domain.Reservation;
import me.magdalena.hotel.infrastructure.database.repository.jpa.ReservationJpaRepository;
import me.magdalena.hotel.infrastructure.database.repository.mapper.ReservationEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class ReservationRepository implements ReservationDAO {

    private final ReservationJpaRepository reservationJpaRepository;
    private final ReservationEntityMapper reservationEntityMapper;

    @Override
    public List<Reservation> findAll() {
        return reservationJpaRepository.findAll()
                                       .stream()
                                       .map(reservationEntityMapper::mapFromEntity)
                                       .toList();
    }

    @Override
    public Optional<Reservation> findById(UUID id) {
        return reservationJpaRepository.findById(id)
                                       .map(reservationEntityMapper::mapFromEntity);
    }

    @Override
    public void createReservation(Reservation reservation) {
        reservationJpaRepository.saveAndFlush(reservationEntityMapper.mapToEntity(reservation));
    }
}
