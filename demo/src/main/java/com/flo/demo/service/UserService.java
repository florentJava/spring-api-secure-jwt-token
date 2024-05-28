package com.flo.demo.service;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.flo.demo.entity.UserEntity;
import com.flo.demo.repository.UserEntityRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserEntityRepository userEntityRepository;

    private static final String EXISTING_EMAIL = "test";
    private static final String ANOTHER_EMAIL = "another";


    public Optional<UserEntity> getUserByEmail(String email) {

        Optional<UserEntity> opUser =  userEntityRepository.findByEmail(email);

        if(opUser.isPresent()){

            UserEntity user = opUser.get();
            return Optional.of(user);
        }
        
        
        return Optional.empty();

    }
    
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
