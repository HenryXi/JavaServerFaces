package com.xxy.form;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {

	String answer = "I'm Hidden value!";

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
}