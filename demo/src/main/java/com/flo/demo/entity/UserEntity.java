package com.flo.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@Table(name = "dbuser")
@Entity
@RequiredArgsConstructor
public class UserEntity {

    @Id
    @Column (name = "id")
    private Long id;

    @Column (name = "username")
    private String email;

    @JsonIgnore
    @Column (name = "password")
    private String password;

    @Column (name = "role")
    private String role;
    
}
