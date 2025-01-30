package com.messenger.user.buissnes;

import com.messenger.user.persistence.user.dao.UserDao;
import com.messenger.user.web.dto.CreateUserDto;
import com.messenger.user.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userRepository;

    public UserDto createUser (CreateUserDto user){
        return userRepository.create(user);
    }
}
