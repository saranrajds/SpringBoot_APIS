package com.example.Blood_Donor_APIS.Controller;

import com.example.Blood_Donor_APIS.BusinessService.IUserBusinessService;
import com.example.Blood_Donor_APIS.BusinessService.UserBusinessService;
import com.example.Blood_Donor_APIS.DTO.UserDTO;
import com.example.Blood_Donor_APIS.Entity.User;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("blood_donor/api/user")
public class UsetController {

    private static final Logger logger = LoggerFactory.getLogger(UsetController.class);

    @Autowired
    IUserBusinessService userBusinessService;

    UsetController() {
        System.out.println("UsetController");
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserDTO userDTO) {
        logger.info("Received addUser request: {}", userDTO);
        String newUser = userBusinessService.addUser(userDTO);
        return newUser;
    }

    @GetMapping("/getUser")
    public List<UserDTO> getUser() {
        List<UserDTO> newUser = userBusinessService.getUser();
        return newUser;
    }
}
