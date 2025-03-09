package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "identity_number", nullable = false, unique = true)
    private String identityNumber; // Số CMND/CCCD

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "apartment_number")
    private String apartmentNumber; // Số căn hộ

    @Column(name = "role")
    private String role; // Vai trò: Cư dân, Ban quản lý, Bảo vệ, ...

    @Column(name = "registration_date")
    private LocalDate registrationDate; // Ngày đăng ký cư trú
}
