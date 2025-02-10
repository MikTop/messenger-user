package com.messenger.user.buissnes;

import com.messenger.user.buissnes.mapper.CreateUserDtoMapper;
import com.messenger.user.buissnes.mapper.UserDtoMapper;
import com.messenger.user.persistence.user.entity.User;
import com.messenger.user.persistence.user.repository.UserRepository;
import com.messenger.user.web.dto.CreateUserDto;
import com.messenger.user.web.dto.SimpleUserSearchDto;
import com.messenger.user.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Objects;
import java.util.Optional;

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

    public void deleteUser (SimpleUserSearchDto user){

        if(Objects.nonNull(user.getId())) {
            userRepository.deleteById((user.getId()));
        }else if(Objects.nonNull(user.getUsername()) && StringUtils.hasText(user.getUsername())){
            userRepository.deleteByUsername(user.getUsername());
        }else throw new RuntimeException("Invalid request");

    }

    public User getUser (SimpleUserSearchDto user){
        Optional<User> maybeUser;

        if(Objects.nonNull(user.getId())) {
           maybeUser = userRepository.findById((user.getId()));
        }else if(Objects.nonNull(user.getUsername()) && StringUtils.hasText(user.getUsername())){
            maybeUser = userRepository.findByUsername(user.getUsername());
        }else throw new RuntimeException("Invalid request");
//        maybeUser.
//      TODO
        return null;
    }
}
