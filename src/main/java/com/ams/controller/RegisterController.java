package com.ams.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.serviceimpl.RegisterUserServiceImpl;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	private final RegisterUserServiceImpl registerservice;
	
	public RegisterController(RegisterUserServiceImpl registerservice) {
        this.registerservice = registerservice;
    }
}
