package com.qiyue.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.qiyue.entity.User;
import com.qiyue.service.inter.UserService;


@ManagedBean
@SessionScoped
@Controller
public class LoginBean {

	@Autowired
	UserService userService;
	
	String userName;
	String userPassword;
	
	
	User user;

	
	/**
	 * Login method for user
	 * @return
	 */
	public String login () {
		
		return "index";
	}

	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
}
