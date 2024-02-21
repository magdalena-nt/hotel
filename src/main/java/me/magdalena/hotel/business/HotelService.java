package me.magdalena.hotel.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.magdalena.hotel.business.dao.HotelDAO;
import me.magdalena.hotel.domain.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@AllArgsConstructor
public class HotelService {

    private final HotelDAO hotelDAO;

    @Transactional
    public List<Hotel> findAll() {
        return hotelDAO.findAll();
    }

    public Hotel findById(UUID id) {
        return hotelDAO.findById(id)
                       .orElseThrow(() -> new RuntimeException("No such hotel"));
    }
}
