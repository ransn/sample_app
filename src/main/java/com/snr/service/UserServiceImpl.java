/**
 * 
 */
package com.snr.service;

import java.util.List;

import com.snr.model.User;
import com.snr.repository.UserRepository;

/**
 * @author I326319
 *
 */
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	public UserServiceImpl() {
		
	}
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	/* (non-Javadoc)
	 * @see com.snr.service.UserService#findAll()
	 */
	@Override
	public List<User> findAll(){
		return userRepository.findAll();
	}


	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
