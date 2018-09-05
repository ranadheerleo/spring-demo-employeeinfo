package com.employeeinfo.dao;

import org.springframework.data.repository.CrudRepository;

import com.employeeinfo.data.Address;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
