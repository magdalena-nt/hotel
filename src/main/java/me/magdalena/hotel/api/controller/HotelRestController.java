package me.magdalena.hotel.api.controller;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.api.dto.HotelsDTO;
import me.magdalena.hotel.api.dto.mapper.HotelMapper;
import me.magdalena.hotel.business.HotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(HotelRestController.API_HOTEL)
public class HotelRestController {
    public static final String API_HOTEL = "/api/hotel";

    private final HotelService hotelService;
    private final HotelMapper hotelMapper;

    @GetMapping
    public HotelsDTO getAllHotels() {
        return HotelsDTO.builder()
                        .hotels(hotelService.findAll()
                                            .stream()
                                            .map(hotelMapper::map)
                                            .toList())
                        .build();
    }

}
