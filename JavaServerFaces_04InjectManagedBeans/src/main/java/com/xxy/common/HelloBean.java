package com.xxy.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{message}")
	private MessageBean messageBean;
	@ManagedProperty(value="#{fail}")
	private FailBean failBean;

	private String name;

    //注入只需要set方法就可以了
	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}


	public void setFailBean(FailBean failBean) {
		this.failBean = failBean;
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
		}else if (name.equals(failBean.getName())) {
			return failBean.getSayHello();
		}{
			return messageBean.getSayWelcome() + name;
		}
	}
	
}