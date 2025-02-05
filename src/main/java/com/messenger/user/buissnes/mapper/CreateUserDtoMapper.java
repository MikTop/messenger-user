package com.messenger.user.buissnes.mapper;

import com.messenger.user.persistence.user.entity.User;
import com.messenger.user.web.dto.CreateUserDto;
import com.messenger.user.web.dto.Role;
import com.messenger.user.web.dto.Sex;
import org.springframework.stereotype.Component;

@Component
public class CreateUserDtoMapper {

    public User mapToUser (CreateUserDto source){
        return User.builder()
                .username(source.getUserName())
                .password(source.getPassword())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .birthDate(source.getBirthDDate())
                .sex(Sex.valueOf(source.getSex()))
                .role(Role.valueOf(source.getRole()))
                .phone(source.getPhone())
                .email(source.getEmail())
                .build();
    }
}
