package com.ams.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.ams.entity.RegisterUser;

public interface RegisterUserRepo extends CrudRepository<RegisterUser, UUID>{

}
