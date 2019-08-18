/**
 * 
 */
package com.snr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.snr.model.User;
import com.snr.repository.UserRepository;

/**
 * @author I326319
 *
 */
@Service("userService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // -- For single object each time
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) -- For unique object each time
public class UserServiceImpl implements UserService {
	
	@Autowired
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


	//public void setUserRepository(UserRepository userRepository) {
	//	this.userRepository = userRepository;
	//}

}
