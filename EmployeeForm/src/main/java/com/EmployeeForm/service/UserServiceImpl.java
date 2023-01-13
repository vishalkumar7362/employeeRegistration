package com.EmployeeForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeForm.entity.User;
import com.EmployeeForm.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void saveUserInfo(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
		
	}
    
	
	
	
}
