package com.messenger.user.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
public class UserDto {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate birthDDate;
    private Sex sex;
    private String phone;
    private String email;
}
