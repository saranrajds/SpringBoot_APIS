package com.example.Blood_Donor_APIS.Mapper;

import com.example.Blood_Donor_APIS.DTO.UserDTO;
import com.example.Blood_Donor_APIS.Entity.User;
import com.example.Blood_Donor_APIS.Enums.Role;

public class UserMapper {

    public static UserDTO toDto(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .email(user.getEmail())
                .mobileNumber(user.getMobileNumber())
                .role(user.getRole())
                .build();
    }

    public static User toEntity(UserDTO userDTO) {
        return User.builder()
                .id(userDTO.getId())
                .username(userDTO.getUsername())
                .password(userDTO.getPassword())
                .email(userDTO.getEmail())
                .mobileNumber(userDTO.getMobileNumber())
                .role(userDTO.getRole())
                .build();
    }
}
