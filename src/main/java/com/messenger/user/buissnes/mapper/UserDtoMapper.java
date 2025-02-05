package com.messenger.user.buissnes.mapper;

import com.messenger.user.persistence.user.entity.User;
import com.messenger.user.web.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {

    public UserDto mapUserToUserDto (User source){
        return UserDto.builder()
                .userName(source.getUsername())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .birthDDate(source.getBirthDate())
                .sex(source.getSex().name())
                .email(source.getEmail())
                .phone(source.getPhone())
                .build();
    }
}
