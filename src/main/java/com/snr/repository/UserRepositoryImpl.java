/**
 * 
 */
package com.snr.repository;

import java.util.ArrayList;
import java.util.List;

import com.snr.model.User;

/**
 * @author I326319
 *
 */
public class UserRepositoryImpl implements UserRepository {
	
	/* (non-Javadoc)
	 * @see com.snr.repository.UserRepository#findAll()
	 */
	@Override
	public List<User> findAll(){
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setFirstName("Ranganath");
		user.setLastName("SN");
		users.add(user);
		return users;
	}

}
