package com.jpafirsttime1.jpafirsttime1.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpafirsttime1.jpafirsttime1.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}


