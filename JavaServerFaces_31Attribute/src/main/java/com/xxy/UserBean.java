package com.xxy;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="user")
@SessionScoped
public class UserBean{

	public String nickname;
	
	//action listener event
	public void attrListener(ActionEvent event){
		 
		nickname = (String)event.getComponent().getAttributes().get("username");
		
	}
	
	public String outcome(){
		return "result";
	}
	
	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}