package me.magdalena.hotel.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.business.dao.GuestDAO;
import me.magdalena.hotel.domain.Guest;
import me.magdalena.hotel.infrastructure.database.repository.jpa.GuestJpaRepository;
import me.magdalena.hotel.infrastructure.database.repository.mapper.GuestEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class GuestRepository implements GuestDAO {

    private final GuestJpaRepository guestJpaRepository;
    private final GuestEntityMapper guestEntityMapper;

    @Override
    public List<Guest> findAll() {
        return guestJpaRepository.findAll()
                                 .stream()
                                 .map(guestEntityMapper::mapFromEntity)
                                 .toList();
    }

    @Override
    public Optional<Guest> findById(UUID id) {
        return guestJpaRepository.findById(id)
                                 .map(guestEntityMapper::mapFromEntity);
    }

    @Override
    public void createGuest(Guest guest) {
        guestJpaRepository.saveAndFlush(guestEntityMapper.mapToEntity(guest));
    }
}
