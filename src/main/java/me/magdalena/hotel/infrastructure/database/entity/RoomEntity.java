package me.magdalena.hotel.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "room")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 3)
    private String number;

    @Column(nullable = false, length = 32)
    private String type;

    @Column(nullable = false)
    private Boolean available;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    private HotelEntity hotel;
}