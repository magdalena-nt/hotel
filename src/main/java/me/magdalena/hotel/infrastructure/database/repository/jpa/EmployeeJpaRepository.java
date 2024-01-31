package me.magdalena.hotel.infrastructure.database.repository.jpa;

import me.magdalena.hotel.infrastructure.database.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<EmployeeEntity, UUID> {

}
