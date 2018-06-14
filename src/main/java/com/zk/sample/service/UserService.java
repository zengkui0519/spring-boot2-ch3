package com.zk.sample.service;

import java.util.List;

import com.zk.sample.entity.User;

public interface UserService {
	List<User> allUser();
	User getUserById(Long id);
	void updateUser(Long id, Integer type);
}
