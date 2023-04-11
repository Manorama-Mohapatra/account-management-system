package com.ams.service;

import java.util.List;

import com.ams.entity.RegisterUser;

public interface RegisterUserService {
 
	public List<RegisterUser> registerUserToDB(Long userCode);
}
