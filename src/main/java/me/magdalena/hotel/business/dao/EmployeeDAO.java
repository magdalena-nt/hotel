package me.magdalena.hotel.business.dao;

import me.magdalena.hotel.domain.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeDAO {

    List<Employee> findAll();

    Optional<Employee> findById(UUID id);

}
