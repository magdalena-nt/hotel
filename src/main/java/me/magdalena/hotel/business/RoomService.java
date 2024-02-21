package me.magdalena.hotel.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.magdalena.hotel.business.dao.RoomDAO;
import me.magdalena.hotel.domain.Room;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@AllArgsConstructor
public class RoomService {

    private final RoomDAO roomDAO;

    @Transactional
    public List<Room> findAll() {
        return roomDAO.findAll();
    }

    @Transactional
    public Room findById(UUID id) {
        return roomDAO.findById(id)
                      .orElseThrow(() -> new RuntimeException("No such room"));
    }
}
