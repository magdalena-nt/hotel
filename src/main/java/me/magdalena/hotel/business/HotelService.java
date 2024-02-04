package me.magdalena.hotel.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.magdalena.hotel.business.dao.HotelDAO;
import me.magdalena.hotel.domain.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class HotelService {

    private final HotelDAO hotelDAO;

    @Transactional
    public List<Hotel> findAll() {
        return hotelDAO.findAll();
    }
}
