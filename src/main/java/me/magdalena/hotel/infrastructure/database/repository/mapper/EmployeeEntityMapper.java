package me.magdalena.hotel.infrastructure.database.repository.mapper;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.domain.Employee;
import me.magdalena.hotel.infrastructure.database.entity.EmployeeEntity;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EmployeeEntityMapper {

    private final HotelEntityMapper hotelEntityMapper;

    public Employee mapFromEntity(EmployeeEntity employeeEntity) {
        return Employee.builder()
                       .id(employeeEntity.getId())
                       .name(employeeEntity.getName())
                       .surname(employeeEntity.getSurname())
                       .phone(employeeEntity.getPhone())
                       .email(employeeEntity.getEmail())
                       .job(employeeEntity.getJob())
                       .hotel(hotelEntityMapper.mapFromEntity(employeeEntity.getHotel()))
                       .build();
    }

    public EmployeeEntity mapToEntity(Employee employee) {
        return EmployeeEntity.builder()
                             .id(employee.getId())
                             .name(employee.getName())
                             .surname(employee.getSurname())
                             .phone(employee.getPhone())
                             .email(employee.getEmail())
                             .job(employee.getJob())
                             .hotel(hotelEntityMapper.mapToEntity(employee.getHotel()))
                             .build();
    }
}
