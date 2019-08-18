/**
 * 
 */
package com.snr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.snr.model.User;
import com.snr.repository.UserRepository;

/**
 * @author I326319
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl() {
		
	}
	
	//@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		System.out.println("we are using autowired in constructor");
		this.userRepository=userRepository;
	}
	
	/* (non-Javadoc)
	 * @see com.snr.service.UserService#findAll()
	 */
	@Override
	public List<User> findAll(){
		System.out.println(dbUsername);
		return userRepository.findAll();
	}

	//@Autowired
	public void setUserRepository(UserRepository userRepository) {
		//System.out.println("we are using autowired in setter");
		this.userRepository = userRepository;
	}

}
