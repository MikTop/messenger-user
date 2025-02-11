package com.messenger.user.web.user;

import com.messenger.user.buissnes.UserService;
import com.messenger.user.web.dto.CreateUserDto;
import com.messenger.user.web.dto.SimpleUserSearchDto;
import com.messenger.user.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/create")
    public ResponseEntity<UserDto> create (@RequestBody CreateUserDto user){
        try {
            return ResponseEntity.ok(userService.createUser(user));
        }catch (Throwable e){
            log.error(ExceptionUtils.getStackTrace(e));
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete (@RequestBody SimpleUserSearchDto user){
        try {
            userService.deleteUser(user);
            return ResponseEntity.ok().build();
        }catch (Throwable e){
            log.error(ExceptionUtils.getStackTrace(e));
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/get")
    public ResponseEntity<UserDto> getUser (@RequestBody SimpleUserSearchDto user){
        try {
            return ResponseEntity.ok(userService.getUser(user));
        }catch (Throwable e){
            log.error(ExceptionUtils.getStackTrace(e));
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping()
    public ResponseEntity<List<UserDto>> getUser (){
        try {
            return ResponseEntity.ok(userService.getAll());
        }catch (Throwable e){
            log.error(ExceptionUtils.getStackTrace(e));
            return ResponseEntity.internalServerError().build();
        }
    }





















}
