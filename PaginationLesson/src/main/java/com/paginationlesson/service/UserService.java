package com.paginationlesson.service;

import com.paginationlesson.dto.PageResponseDto;
import com.paginationlesson.dto.UserRequestDto;
import com.paginationlesson.entity.UserEntity;
import com.paginationlesson.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public PageResponseDto getAllUsersWithPagination(int pageNumber, int pageSize)
    {
        Page<UserEntity> all = userRepository.findAll(PageRequest.of(pageNumber, pageSize));

        return new PageResponseDto(
                all.getTotalElements(),
                all.getTotalPages(),
                all.getContent(),
                all.hasNext()
        );
    }

    public void save(UserRequestDto requestDto)
    {
        UserEntity entity = new UserEntity();
        entity.setName(requestDto.getName());
        entity.setBirthDate(requestDto.getBirtDate());
        userRepository.save(entity);
    }

}
