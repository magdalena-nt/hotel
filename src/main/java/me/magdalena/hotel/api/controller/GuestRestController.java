package me.magdalena.hotel.api.controller;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.api.dto.GuestDTO;
import me.magdalena.hotel.api.dto.GuestsDTO;
import me.magdalena.hotel.api.dto.mapper.GuestMapper;
import me.magdalena.hotel.business.GuestService;
import me.magdalena.hotel.domain.Guest;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(GuestRestController.API_GUEST)
public class GuestRestController {
    public static final String API_GUEST = "/api/guest";

    private final GuestService guestService;
    private final GuestMapper guestMapper;

    @GetMapping
    public GuestsDTO getAllGuests() {
        return GuestsDTO.builder()
                        .guests(guestService.findAll()
                                            .stream()
                                            .map(guestMapper::map)
                                            .toList())
                        .build();
    }

    @PostMapping(value = "/create", consumes = "application/json")
    public void createGuest(@RequestBody GuestDTO guestDTO) {
        Guest guest = guestMapper.map(guestDTO);
        guestService.createGuest(guest);
    }

}
