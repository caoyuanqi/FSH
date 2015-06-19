package com.qiyue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiyue.dao.UserDao;
import com.qiyue.entity.User;
import com.qiyue.service.inter.UserService;

@Service("userService")
public class UserServiceImpl extends BaseService implements UserService{
	
	@Autowired
	UserDao userDao;
	
	
	
	public void saveUser(String userName, String password, String alias) {
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setAlias(alias);
		log("User name: " + userName
				+" Password: " + password
				+" Alias: " + alias);
		userDao.save(user);
	}
	
}
