package com.EmployeeForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeForm.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
