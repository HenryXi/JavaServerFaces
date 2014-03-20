package com.mkyong.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="message")
@SessionScoped
public class MessageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String sayWelcome = "Welcome to JSF 2.0";

	public String getSayWelcome() {
		return sayWelcome;
	}

	public void setSayWelcome(String sayWelcome) {
		this.sayWelcome = sayWelcome;
	}

}