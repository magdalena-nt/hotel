package me.magdalena.hotel.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.business.dao.RoomDAO;
import me.magdalena.hotel.domain.Room;
import me.magdalena.hotel.infrastructure.database.repository.jpa.RoomJpaRepository;
import me.magdalena.hotel.infrastructure.database.repository.mapper.RoomEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class RoomRepository implements RoomDAO {

    private final RoomJpaRepository roomJpaRepository;
    private final RoomEntityMapper roomEntityMapper;

    @Override
    public List<Room> findAll() {
        return roomJpaRepository.findAll()
                                .stream()
                                .map(roomEntityMapper::mapFromEntity)
                                .toList();
    }

    @Override
    public Optional<Room> findById(UUID id) {
        return roomJpaRepository.findById(id)
                                .map(roomEntityMapper::mapFromEntity);
    }
}
