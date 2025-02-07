package com.messenger.user.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserDto {

    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate birthDDate;
    private String sex;
    private String phone;
    private String email;
}
