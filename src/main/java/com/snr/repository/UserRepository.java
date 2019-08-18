package com.snr.repository;

import java.util.List;

import com.snr.model.User;

public interface UserRepository {

	List<User> findAll();

}