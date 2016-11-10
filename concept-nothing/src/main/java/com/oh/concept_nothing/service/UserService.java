package com.oh.concept_nothing.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oh.concept_nothing.domain.User;
import com.oh.concept_nothing.repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public void create(User user) {
		userRepository.save(user);
	}
	
	public User findById(int id) {
		return userRepository.findOne(id);
	}
}
