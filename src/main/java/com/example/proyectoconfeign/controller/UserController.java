package com.example.proyectoconfeign.controller;

import com.example.proyectoconfeign.dto.UserDTO;
import com.example.proyectoconfeign.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(UserController.CONTEXT_PATH)
@RequiredArgsConstructor
public class UserController {

    public static final String CONTEXT_PATH = "/v1/usuario";
    private final UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> getAll(){
       return new ResponseEntity<>(userService.getUser(), HttpStatus.OK);
    }

}
