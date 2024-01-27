package me.magdalena.hotel.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "hotel")
@Getter
@Setter
@NoArgsConstructor
public class HotelEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 32)
    private String name;

    @Column(nullable = false, length = 128)
    private String location;

    @Column(nullable = false)
    private Short floors;

    @Column(name = "contact_info", nullable = false, length = 64)
    private String contactInfo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel")
    private Set<RoomEntity> rooms;
}