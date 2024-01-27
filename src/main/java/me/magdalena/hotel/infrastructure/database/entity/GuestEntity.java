package me.magdalena.hotel.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "guest")
@Getter
@Setter
@NoArgsConstructor
public class GuestEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 32)
    private String name;

    @Column(nullable = false, length = 32)
    private String surname;

    @Column(nullable = false, length = 32)
    private String phone;

    @Column(nullable = false, length = 32)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "guest")
    private Set<ReservationEntity> reservations;
}