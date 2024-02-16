package me.magdalena.hotel.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuestDTO {

    private UUID id;
    private String name;
    private String surname;
    private String phone;
    private String email;
}
