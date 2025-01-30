package com.messenger.user.persistence.user.entity;

import com.messenger.user.web.dto.Role;
import com.messenger.user.web.dto.Sex;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    private Integer id;
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
