package me.magdalena.hotel.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.business.dao.EmployeeDAO;
import me.magdalena.hotel.domain.Employee;
import me.magdalena.hotel.infrastructure.database.repository.jpa.EmployeeJpaRepository;
import me.magdalena.hotel.infrastructure.database.repository.mapper.EmployeeEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class EmployeeRepository implements EmployeeDAO {

    private final EmployeeJpaRepository employeeJpaRepository;
    private final EmployeeEntityMapper employeeEntityMapper;

    @Override
    public List<Employee> findAll() {
        return employeeJpaRepository.findAll()
                                    .stream()
                                    .map(employeeEntityMapper::mapFromEntity)
                                    .toList();
    }

    @Override
    public Optional<Employee> findById(UUID id) {
        return employeeJpaRepository.findById(id)
                                    .map(employeeEntityMapper::mapFromEntity);
    }
}
