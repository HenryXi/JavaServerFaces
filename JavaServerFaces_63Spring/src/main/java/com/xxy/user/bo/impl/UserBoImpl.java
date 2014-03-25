package com.xxy.user.bo.impl;

import javax.inject.Named;

import com.xxy.user.bo.UserBo;

@Named
public class UserBoImpl implements UserBo{
 
	public String getMessage() {
		
		return "JSF 2 + Spring Integration";
	
	}
 
}