package com.rd.quality.web3d.doamin;

import java.io.Serializable;
import java.util.List;
/**
 *@description  系统用户   
 *
 *@author AlexLee
 *@createTime 2013-3-25 下午2:21:47
 * 
 *@TypeName com.rd.quality.web3d.doamin.User
 */
public class User implements Serializable{

	private static final long serialVersionUID = -7398308107630350186L;

	private int userId;
	private String userName;
	private String loginName;
	private String password;
	private String email;
	private String cellphone;
	
	/**
	 * 用户类型,作为扩充点
	 * 监理 部门领导 普通用户
	 */
	private String userType;
	/**
	 * 用户所属的部门
	 */
	private Department department;
	/**
	 * 这里我们使用用户查权限，没有权限查用户的道理
	 */
	private List<UserRole> userRole;

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public List<UserRole> getUserRole() {
		return userRole;
	}
	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
