package com.example.proyectoconfeign.service;

import com.example.proyectoconfeign.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="nameFeignClient", url="${rest.endpoints.mockUser.url}")
public interface UserFeignClient {

    @GetMapping("/usuarios")
    public List<UserDTO> getAll();
}
