package com.wissen.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.model.User;
import com.wissen.repository.UserRepository;
import com.wissen.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	//Logger logger=LoggerFactory.getILoggerFactory(UserServiceImpl.class);
	@Autowired
	UserRepository userRepository;
	
	public User createUser(User user) {
		System.out.println("Service");
		return userRepository.save(user);
	}
}
