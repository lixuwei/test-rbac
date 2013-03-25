package com.rd.quality.web3d.doamin;

import java.io.Serializable;

/**
 *@description   用户角色关联表
 *
 *@author AlexLee
 *@createTime 2013-3-25 下午2:33:45
 * 
 *@TypeName com.rd.quality.web3d.doamin.UserRole
 */
public class UserRole implements Serializable{

	private static final long serialVersionUID = -7212444196433639251L;

	private int id;
	private int userId;
	private int roleId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
}
