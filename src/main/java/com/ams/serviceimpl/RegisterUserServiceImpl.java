package com.ams.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.entity.RegisterUser;
import com.ams.repository.RegisterUserRepo;
import com.ams.service.RegisterUserService;


@Service
public class RegisterUserServiceImpl implements RegisterUserService{
	
	private final RegisterUserRepo customerRepo;

    public RegisterUserServiceImpl(RegisterUserRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
	
	List<RegisterUser> list = List.of(
            new RegisterUser(1L, "Lee@gmail.com", "Lee", "name"),
            new RegisterUser(2L, "John@gmail.com", "John", "name"),
            new RegisterUser(3L, "Johnson@gmail.com", "Johnson", "name"),
            new RegisterUser(4L, "sameer@gmail.com", "Sameer", "name")
    );
    
	public RegisterUser create(RegisterUser user){
        return customerRepo.save(user);
    }

	@Override
	public List<RegisterUser> registerUserToDB(Long userCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
