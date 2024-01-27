package me.magdalena.hotel.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false, length = 64)
    private String surname;

    @Column(nullable = false, length = 14)
    private String phone;

    @Column(length = 32)
    private String email;

    @Column(nullable = false, length = 32)
    private String job;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    private HotelEntity hotel;
}