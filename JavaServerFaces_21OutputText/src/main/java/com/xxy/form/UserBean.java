package com.xxy.form;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped
public class UserBean{

	public String text = "This is Text!";
	public String htmlInput = "<input type='text' size='20' />";
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getHtmlInput() {
		return htmlInput;
	}
	public void setHtmlInput(String htmlInput) {
		this.htmlInput = htmlInput;
	}
	
}