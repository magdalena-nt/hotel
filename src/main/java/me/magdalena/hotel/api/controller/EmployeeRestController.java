package me.magdalena.hotel.api.controller;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.api.dto.EmployeesDTO;
import me.magdalena.hotel.api.dto.mapper.EmployeeMapper;
import me.magdalena.hotel.business.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(EmployeeRestController.API_EMPLOYEE)
public class EmployeeRestController {
    public static final String API_EMPLOYEE = "/api/employee";

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    @GetMapping
    public EmployeesDTO getAllEmployees() {
        return EmployeesDTO.builder()
                           .employees(employeeService.findAll()
                                                     .stream()
                                                     .map(employeeMapper::map)
                                                     .toList())
                           .build();
    }

}
