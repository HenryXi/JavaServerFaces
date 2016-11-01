package com.xxy.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="fail")
@SessionScoped
public class FailBean implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name = "ragrok";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public String getSayHello(){
		return "my name is ragrok";
	}
}
