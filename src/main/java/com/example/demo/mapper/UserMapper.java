package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.example.demo.dto.UserDto;

public class UserMapper {
    public static UserDto mapToUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getIdentityNumber(),
                user.getGender(),
                user.getAddress(),
                user.getApartmentNumber(),
                user.getRole()
        );
    }

    public static User mapToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPhoneNumber(),
                userDto.getIdentityNumber(),
                null, userDto.getGender(),
                userDto.getAddress(),
                userDto.getApartmentNumber(),
                userDto.getRole(), null
        );
    }
}
