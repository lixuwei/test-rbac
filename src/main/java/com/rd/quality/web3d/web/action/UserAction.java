package com.rd.quality.web3d.web.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.rd.quality.web3d.domain.User;
import com.rd.quality.web3d.exception.UserException;
import com.rd.quality.web3d.service.UserService;

/**
 * @description 处理页面提交的用户相关请求
 * @author AlexLee
 * @createTime 2013-3-26 下午5:05:25
 * 
 * @TypeName com.rd.quality.web3d.web.action.UserAction
 */
public class UserAction {
	
	private static Logger logger = Logger.getLogger(UserAction.class);
	
	private String loginName;
	private String password;
	private String loginMsg;
	
	
	@Autowired
	private UserService userService;
	
	public String login(){
		User user = null;
		
		try {
			user = userService.findUserByName(loginName);
		} catch (UserException e) {
			logger.info(e.getMessage());
			loginMsg = e.getMessage();
			return "loginfails";
		}
		if(user==null){
			loginMsg = "登录名不存在";
			return "loginfails";
		}
		if(!user.getPassword().equals(password)){
			loginMsg = "密码不正确";
			return "loginfails";
		}
		
		/**
		 * 将用户ID放入Session中
		 */
		ActionContext.getContext().getSession().put("userid", user.getUserId());
		ActionContext.getContext().getSession().put("username", user.getUserName());
		
		return "login";
	}
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginMsg() {
		return loginMsg;
	}

	public void setLoginMsg(String loginMsg) {
		this.loginMsg = loginMsg;
	}
	
	
}
