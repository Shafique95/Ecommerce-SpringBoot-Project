package com.ecommerce.ecom.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.ecom.app.other.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByName(String name);

}
