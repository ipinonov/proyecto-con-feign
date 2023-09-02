package com.example.proyectoconfeign.service;

import com.example.proyectoconfeign.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserFeignClient client;

    public List<UserDTO> getUser(){
        return client.getAll().stream().
                filter(a -> a.getName().contains("Mitchell") ||  a.getName().contains("Harris"))
                .sorted(Comparator.comparing(UserDTO::getId).reversed())
                .collect(Collectors.toList());
    }

}
