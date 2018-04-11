package com.springmvc.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Users;

@Repository
public interface UsersRepository extends MongoRepository<Users, String>{
	 public Users findByFirstName(String firstName);
	    public List<Users> findByLastName(String lastName);
}
