package com.messenger.user.web.user;

import com.messenger.user.buissnes.UserService;
import com.messenger.user.web.dto.CreateUserDto;
import com.messenger.user.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public UserDto create (CreateUserDto user){
        return userService.createUser(user);
    }
}
