package me.magdalena.hotel.api.controller;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.api.dto.ReservationsDTO;
import me.magdalena.hotel.api.dto.mapper.ReservationMapper;
import me.magdalena.hotel.business.ReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(ReservationRestController.API_RESERVATION)
public class ReservationRestController {
    public static final String API_RESERVATION = "/api/reservation";

    private final ReservationService reservationService;
    private final ReservationMapper reservationMapper;

    @GetMapping
    public ReservationsDTO getAllReservations() {
        return ReservationsDTO.builder()
                              .reservations(reservationService.findAll()
                                                              .stream()
                                                              .map(reservationMapper::map)
                                                              .toList())
                              .build();
    }

}
