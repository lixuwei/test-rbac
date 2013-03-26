package com.rd.quality.web3d.domain;

import java.io.Serializable;
import java.util.List;

/**
 *@description 部门表
 *@author AlexLee
 *@createTime 2013-3-25 下午4:32:42
 * 
 *@TypeName com.rd.quality.web3d.doamin.Department
 */
public class Department implements Serializable {
	
	private static final long serialVersionUID = 4149770253750788971L;
	
	private int departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentDescription;
	/**
	 * 部门下的用户
	 */
	private List<User> users;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	
}
