package com.ryanoviski.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryanoviski.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
