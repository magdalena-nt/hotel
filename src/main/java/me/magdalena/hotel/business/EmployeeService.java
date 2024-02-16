package me.magdalena.hotel.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.magdalena.hotel.business.dao.EmployeeDAO;
import me.magdalena.hotel.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeDAO employeeDAO;

    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
