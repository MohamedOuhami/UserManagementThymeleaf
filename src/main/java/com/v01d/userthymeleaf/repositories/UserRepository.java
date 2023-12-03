package com.v01d.userthymeleaf.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.v01d.userthymeleaf.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
    
}
