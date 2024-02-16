package me.magdalena.hotel.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.magdalena.hotel.business.dao.GuestDAO;
import me.magdalena.hotel.domain.Guest;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class GuestService {

    private final GuestDAO guestDAO;

    @Transactional
    public List<Guest> findAll() {
        return guestDAO.findAll();
    }

    public void createGuest(Guest guest) {
        guestDAO.createGuest(guest);
    }
}
