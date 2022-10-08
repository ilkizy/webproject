package com.ilkiz.webproject.service;

import com.ilkiz.webproject.dto.request.UserSaveRequestDto;
import com.ilkiz.webproject.dto.response.UserSaveResponseDto;
import com.ilkiz.webproject.mapper.UserMapper;
import com.ilkiz.webproject.repository.IUserRepository;
import com.ilkiz.webproject.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.criteria.internal.predicate.BooleanExpressionPredicate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IUserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }
    public UserSaveResponseDto saveDto(UserSaveRequestDto dto) {

        User user =UserMapper.INSTANCE.toUser(dto);
        userRepository.save(user);
        return UserMapper.INSTANCE.toUserSaveResponseDto(user);

    }

    public Optional<User> login(String username, String password){
        Optional<User> user = Optional.ofNullable(userRepository.findOptionalByUsernameAndPassword(username, password));
        if (user.isEmpty()) {
            System.out.println("Kullanici bulunamadi");
            return null;
        }
        return user;
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }
}
