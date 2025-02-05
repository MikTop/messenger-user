package com.messenger.user.persistence.user.entity;

import com.messenger.user.web.dto.Role;
import com.messenger.user.web.dto.Sex;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    @Column(name = "sex_id")
    private Sex sex;

    @Column(name = "role_id")
    private Role role;

    private String phone;

    private String email;

    private boolean isDeleted;

    private LocalDateTime lastChange;
}
