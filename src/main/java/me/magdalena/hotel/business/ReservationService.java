package me.magdalena.hotel.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.magdalena.hotel.business.dao.ReservationDAO;
import me.magdalena.hotel.domain.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationDAO reservationDAO;

    @Transactional
    public List<Reservation> findAll() {
        return reservationDAO.findAll();
    }

    public void createReservation(Reservation reservation) {
        reservationDAO.createReservation(reservation);
    }
}
