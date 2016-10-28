package com.xxy.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String passwrod;

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSayWelcome(){
		//check if null?
		if("".equals(name) || name ==null){
			return "";
		}else if ("ragrok".equals(getName()) && "1234".equals(getPasswrod())) {
			return "Ajax message : name: ragrok,password:1234.";
		}else{
			return "Ajax message : Welcome " + name;
		}
	}
	
}