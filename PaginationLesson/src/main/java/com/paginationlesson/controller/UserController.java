package com.paginationlesson.controller;

import com.paginationlesson.dto.PageResponseDto;
import com.paginationlesson.dto.UserRequestDto;
import com.paginationlesson.entity.UserEntity;
import com.paginationlesson.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user-api")
public class UserController {
    private final UserService userService ;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/allusers")
    public List<UserEntity> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/pagination")
    public PageResponseDto getAllUsersWithPagination(
        @RequestParam("pageNumber") int pageNumber,
        @RequestParam("pageSize")   int pageSize
    )
    {
        return userService.getAllUsersWithPagination(pageNumber, pageSize);
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody UserRequestDto requestDto)
    {
        userService.save(requestDto);
    }

}
