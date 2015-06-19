package com.qiyue.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.qiyue.entity.User;
import com.qiyue.service.inter.UserService;

@Controller
@ManagedBean
@RequestScoped
public class RegisterBean extends BaseManageBean{
	
	String userName;
	String password;
	String alias;
	
	@Autowired
	UserService userService;
	
	
	// Getter and setter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public void register(){
		User user = new User();
		user.setUserName(userName);
		user.setAlias(alias);
		user.setPassword(password);
		logger.info("The user service is " + userService);
		userService.saveUser(userName, password, alias);
	}
	
}
