package me.magdalena.hotel.domain;

import lombok.*;

import java.util.UUID;

@With
@Value
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = {"name", "surname", "phone", "email", "job"})
public class Employee {
    UUID id;
    String name;
    String surname;
    String phone;
    String email;
    String job;
}
