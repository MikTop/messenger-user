package com.messenger.user.buissnes;

import com.messenger.user.buissnes.mapper.CreateUserDtoMapper;
import com.messenger.user.buissnes.mapper.UserDtoMapper;
import com.messenger.user.persistence.user.entity.User;
import com.messenger.user.persistence.user.repository.UserRepository;
import com.messenger.user.web.dto.CreateUserDto;
import com.messenger.user.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDtoMapper userDtoMapper;
    private final CreateUserDtoMapper createUserDtoMapper;

    private final UserRepository userRepository;

    public UserDto createUser (CreateUserDto newUser){

        User user = userRepository.save(createUserDtoMapper.mapToUser(newUser));

        return userDtoMapper.mapUserToUserDto(user);
    }
}
