package com.example.Blood_Donor_APIS.BusinessService;

import com.example.Blood_Donor_APIS.DTO.UserDTO;
import com.example.Blood_Donor_APIS.Entity.User;
import com.example.Blood_Donor_APIS.Enums.Role;
import com.example.Blood_Donor_APIS.Mapper.UserMapper;
import com.example.Blood_Donor_APIS.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserBusinessService implements IUserBusinessService{

    @Autowired
    UserRepository userRepository;


    @Override
    public String addUser(UserDTO userDTO) {

        User user = UserMapper.toEntity(userDTO);
        userRepository.save(user);
        return user.getUsername();
    }

    @Override
    public List<UserDTO> getUser() {

        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOS = new ArrayList<>();
        for(User user: users) {
            userDTOS.add(UserMapper.toDto(user));
        }

        return userDTOS;
    }
}
