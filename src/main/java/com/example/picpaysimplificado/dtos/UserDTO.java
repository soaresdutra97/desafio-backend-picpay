package com.example.picpaysimplificado.dtos;

import com.example.picpaysimplificado.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String email, BigDecimal balance, String password, UserType userType, String document) {

}
