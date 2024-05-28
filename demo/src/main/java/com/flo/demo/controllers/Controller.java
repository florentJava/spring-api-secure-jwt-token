package com.flo.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.flo.demo.security.UserPrincipal;

import lombok.RequiredArgsConstructor;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequiredArgsConstructor
public class Controller {

    @GetMapping("/")
    public String greeting() {
        return  "Hello World!";
    }

    @GetMapping("/secured")
    public String secured(@AuthenticationPrincipal  UserPrincipal principal) {
        return  "if you see this, then  you log in  as  " +
                principal.getEmail() + " UserId  " + principal.getUserId();
    }    
}
