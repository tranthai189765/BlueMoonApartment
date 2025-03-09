package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String identityNumber; // Số CMND/CCCD
    private String gender;
    private String address;
    private String apartmentNumber; // Số căn hộ
    private String role; // Vai trò: Cư dân, Ban quản lý, Bảo vệ, ...
}
