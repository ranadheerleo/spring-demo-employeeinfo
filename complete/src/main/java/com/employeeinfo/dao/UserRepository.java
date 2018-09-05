package com.employeeinfo.dao;

import org.springframework.data.repository.CrudRepository;

import com.employeeinfo.data.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
