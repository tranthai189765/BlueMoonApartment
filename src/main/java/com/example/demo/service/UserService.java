package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();
    UserDto updateUser(Long userId, UserDto updatedUser);
	void deleteUser(Long userId);
}
