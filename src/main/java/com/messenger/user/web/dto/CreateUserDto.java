package com.messenger.user.web.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class CreateUserDto {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate birthDDate;
    private Sex sex;
    private Role role;
    private String phone;
    private String email;
    private boolean isDeleted ;
    private LocalDateTime lastChange;
}
