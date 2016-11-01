package com.xxy;

import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;
import com.xxy.user.bo.UserBo;

@Named
@Scope("session")
public class UserBean {

	@Inject
	UserBo userBo;

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String printMsgFromSpring() {
		return userBo.getMessage();
	}

}