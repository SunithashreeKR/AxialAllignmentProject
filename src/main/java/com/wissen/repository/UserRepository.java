package com.wissen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wissen.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
