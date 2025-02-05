package com.messenger.user.web.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CreateUserDto {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate birthDDate;
    private String sex;
    private String role;
    private String phone;
    private String email;

}
