package com.example.Blood_Donor_APIS.Repository;

import com.example.Blood_Donor_APIS.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
