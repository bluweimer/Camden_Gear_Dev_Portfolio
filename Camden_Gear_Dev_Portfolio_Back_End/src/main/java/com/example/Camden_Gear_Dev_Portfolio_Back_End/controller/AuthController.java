package com.example.Camden_Gear_Dev_Portfolio_Back_End.controller;

import com.example.Camden_Gear_Dev_Portfolio_Back_End.service.TokenService;
import com.example.Camden_Gear_Dev_Portfolio_Back_End.model.LoginRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController 
public class AuthController {

    public static final Logger LOG = LoggerFactory.getLogger(AuthController.class);
    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;

    public AuthController(TokenService tokenService, AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
    }

    //Authenticate, then generate token to be stored to the header.
    //************************************************************************
    @PostMapping("/token")
    public String token(@RequestBody LoginRequest userLogin){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userLogin.username(), userLogin.password()));
        return tokenService.generateToken(authentication);
    }






}
