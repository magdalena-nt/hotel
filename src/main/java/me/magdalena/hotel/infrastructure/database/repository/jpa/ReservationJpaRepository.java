package me.magdalena.hotel.infrastructure.database.repository.jpa;

import me.magdalena.hotel.infrastructure.database.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.UUID;

@Repository
public interface ReservationJpaRepository extends JpaRepository<ReservationEntity, UUID> {

    Set<ReservationEntity> findReservationEntitiesByCheckedInTrue();
}
