package com.rd.quality.web3d.doamin;

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
	
	private int departmentid;
	private String departmentname;
	private String departmentCode;
	private List<User> users;
	
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
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
}
