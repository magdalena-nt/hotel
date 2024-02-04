package me.magdalena.hotel.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.configuration.AbstractIT;
import me.magdalena.hotel.domain.Hotel;
import me.magdalena.hotel.infrastructure.database.entity.HotelEntity;
import me.magdalena.hotel.infrastructure.database.repository.jpa.HotelJpaRepository;
import me.magdalena.hotel.util.HotelEntityFixtures;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@AllArgsConstructor(onConstructor = @__(@Autowired))
class HotelRepositoryTest extends AbstractIT {

    private final HotelJpaRepository hotelJpaRepository;
    private final HotelRepository hotelRepository;

    @AfterEach
    void afterEach() {
        hotelJpaRepository.deleteAll();
    }

    @Test
    void shouldReturnAllHotels() {
        // Arrange - Insert some hotels into the test database
        HotelEntity hotel1 = HotelEntityFixtures.createHotelEntityOne();
        HotelEntity hotel2 = HotelEntityFixtures.createHotelEntityTwo();
        hotelJpaRepository.save(hotel1);
        hotelJpaRepository.save(hotel2);

        // Act
        List<Hotel> hotels = hotelRepository.findAll();

        // Assert
        assertNotNull(hotels);
        assertEquals(2, hotels.size());
    }

    @Test
    void shouldReturnHotelWhenIdExists() {
        // Arrange
        HotelEntity hotel = HotelEntityFixtures.createHotelEntityOne();
        hotelJpaRepository.save(hotel);

        // Act
        Optional<Hotel> foundHotel = hotelRepository.findById(hotel.getId());

        // Assert
        assertTrue(foundHotel.isPresent());
    }

}