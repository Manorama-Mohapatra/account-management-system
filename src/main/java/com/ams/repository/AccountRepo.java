package com.ams.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.ams.entity.Accounts;

public interface AccountRepo extends CrudRepository<Accounts, UUID>{

}
