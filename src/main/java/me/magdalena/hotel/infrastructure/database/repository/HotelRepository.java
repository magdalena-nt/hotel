package me.magdalena.hotel.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.business.dao.HotelDAO;
import me.magdalena.hotel.domain.Hotel;
import me.magdalena.hotel.infrastructure.database.repository.jpa.HotelJpaRepository;
import me.magdalena.hotel.infrastructure.database.repository.mapper.HotelEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class HotelRepository implements HotelDAO {

    private final HotelJpaRepository hotelJpaRepository;
    private final HotelEntityMapper hotelEntityMapper;

    @Override
    public List<Hotel> findAll() {
        return hotelJpaRepository.findAll()
                                 .stream()
                                 .map(hotelEntityMapper::mapFromEntity)
                                 .toList();
    }

    @Override
    public Optional<Hotel> findById(UUID id) {
        return hotelJpaRepository.findById(id)
                                 .map(hotelEntityMapper::mapFromEntity);
    }
}
