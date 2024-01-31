package me.magdalena.hotel.infrastructure.database.repository.jpa;

import me.magdalena.hotel.infrastructure.database.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoomJpaRepository extends JpaRepository<RoomEntity, UUID> {

}
