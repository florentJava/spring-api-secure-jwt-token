package com.flo.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flo.demo.entity.UserEntity;
import com.flo.demo.model.LoginRequest;

@Repository
public interface UserEntityRepository  extends JpaRepository<UserEntity, Long>{
    
    Optional<UserEntity> findByEmail(String email);
}
