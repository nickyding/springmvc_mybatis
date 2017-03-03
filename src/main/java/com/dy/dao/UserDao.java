package com.dy.dao;

import com.dy.domain.User;

public interface UserDao {
	public User selectUserById(Integer userId);
}
