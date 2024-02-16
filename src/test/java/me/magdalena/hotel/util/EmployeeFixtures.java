package me.magdalena.hotel.util;

import me.magdalena.hotel.domain.Employee;

import java.util.UUID;

// ...

public class EmployeeFixtures {

    public static Employee employeeJohn() {
        return Employee.builder()
                       .id(UUID.randomUUID())
                       .name("John")
                       .surname("Doe")
                       .phone("123-456-7890")
                       .email("john.doe@example.com")
                       .job("Developer")
                       .hotel(HotelFixtures.someHotel()) // Assuming you have a similar fixture for Hotel
                       .build();
    }

    public static Employee employeeJane() {
        return Employee.builder()
                       .id(UUID.randomUUID())
                       .name("Jane")
                       .surname("Doe")
                       .phone("098-765-4321")
                       .email("jane.doe@example.com")
                       .job("Designer")
                       .hotel(HotelFixtures.someHotel()) // Assuming you have a similar fixture for Hotel
                       .build();
    }

    public static Employee employeeMike() {
        return Employee.builder()
                       .id(UUID.randomUUID())
                       .name("Mike")
                       .surname("Smith")
                       .phone("555-555-5555")
                       .email("mike.smith@example.com")
                       .job("Manager")
                       .hotel(HotelFixtures.someHotel()) // Assuming you have a similar fixture for Hotel
                       .build();
    }

    // ... (You can add more fixtures or utility methods if needed)
}
