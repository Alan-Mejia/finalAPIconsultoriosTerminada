package com.alan.finalAPIconsultorios.controller;

import com.alan.finalAPIconsultorios.dtos.SimpleUserDTO;
import com.alan.finalAPIconsultorios.models.User;
import com.alan.finalAPIconsultorios.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("api/v1/users")
public class UserController extends GenericControllerImpl<User,UserServiceImpl> {


    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/all/dto/")
    private CompletableFuture<ResponseEntity> getAllDTO(){
        return userService.getAllDTO().thenApply(ResponseEntity::ok);
    }



}
