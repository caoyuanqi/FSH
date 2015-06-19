package com.qiyue.dao;

import org.springframework.data.repository.CrudRepository;

import com.qiyue.entity.User;

public interface UserDao extends CrudRepository<User, Long> {
	
	public User findByUserName(String userName);
}
