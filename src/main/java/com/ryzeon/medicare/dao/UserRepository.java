package com.ryzeon.medicare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ryzeon.medicare.entity.User;

@RepositoryRestResource(path="user")
public interface UserRepository extends JpaRepository<User, Integer> {

}
