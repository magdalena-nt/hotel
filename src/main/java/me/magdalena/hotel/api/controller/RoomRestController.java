package me.magdalena.hotel.api.controller;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.api.dto.RoomsDTO;
import me.magdalena.hotel.api.dto.mapper.RoomMapper;
import me.magdalena.hotel.business.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(RoomRestController.API_ROOM)
public class RoomRestController {
    public static final String API_ROOM = "/api/room";

    private final RoomService roomService;
    private final RoomMapper roomMapper;

    @GetMapping
    public RoomsDTO getAllRooms() {
        return RoomsDTO.builder()
                       .rooms(roomService.findAll()
                                         .stream()
                                         .map(roomMapper::map)
                                         .toList())
                       .build();
    }

}
