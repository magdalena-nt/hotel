package me.magdalena.hotel.api.dto.mapper;

import me.magdalena.hotel.api.dto.EmployeeDTO;
import me.magdalena.hotel.domain.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public EmployeeDTO map(Employee employee) {
        if (employee == null) {
            return null;
        }
        return EmployeeDTO.builder()
                          .id(employee.getId())
                          .name(employee.getName())
                          .surname(employee.getSurname())
                          .phone(employee.getPhone())
                          .email(employee.getEmail())
                          .job(employee.getJob())
                          .hotelId(employee.getHotel()
                                           .getId())
                          .build();
    }
}
