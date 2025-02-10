package com.techproed.schoolmanagementbackendb326.controller.user;

import com.techproed.schoolmanagementbackendb326.payload.request.user.UserRequest;
import com.techproed.schoolmanagementbackendb326.payload.response.business.ResponseMessage;
import com.techproed.schoolmanagementbackendb326.payload.response.user.UserResponse;
import com.techproed.schoolmanagementbackendb326.repository.user.UserRepository;
import com.techproed.schoolmanagementbackendb326.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    @PostMapping("/save/{UserRole}")
    public ResponseEntity<ResponseMessage<UserResponse>>saveUser(
            @RequestBody @Valid UserRequest userRequest,
            @PathVariable String userRole){
        return ResponseEntity.ok(userService.saveUser(userRequest,userRole));


    }
}


