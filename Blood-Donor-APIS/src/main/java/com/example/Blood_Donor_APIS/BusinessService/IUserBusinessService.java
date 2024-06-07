package com.example.Blood_Donor_APIS.BusinessService;

import com.example.Blood_Donor_APIS.DTO.UserDTO;

import java.util.List;

public interface IUserBusinessService {

    String addUser(UserDTO userDTO);

    List<UserDTO> getUser();
}
