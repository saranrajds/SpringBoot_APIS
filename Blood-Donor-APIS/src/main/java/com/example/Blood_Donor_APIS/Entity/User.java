package com.example.Blood_Donor_APIS.Entity;

import com.example.Blood_Donor_APIS.Enums.Role;
//import jakarta.persistence.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "mobileNumber")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Username is required")
    @Size(min = 4, max = 50, message = "Username must be between 4 and 50 characters")
    @Column(nullable = false, unique = true)
    private String username;

    @NotEmpty(message = "Password is required")
    @Column(nullable = false)
    private String password;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email is required")
    @Column(nullable = false, unique = true)
    private String email;

    @NotEmpty(message = "Mobile number is required")
//    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Invalid mobile number")
    @Column(nullable = false, unique = true)
    private String mobileNumber;

//    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private int role;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
