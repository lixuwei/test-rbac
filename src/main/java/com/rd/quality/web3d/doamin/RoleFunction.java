package com.rd.quality.web3d.doamin;

import java.io.Serializable;
/**
 * @description 角色和功能表
 *
 * @author      Alex Lee
 * @createTiem  2013-3-25 下午10:11:22
 *
 * @TypeName com.rd.quality.web3d.doamin.RoleFunction
 */
public class RoleFunction implements Serializable{

	private static final long serialVersionUID = -5915258327133610469L;

	private int id;
	
	private int roleId;
	private int functionId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getFunctionId() {
		return functionId;
	}
	public void setFunctionId(int functionId) {
		this.functionId = functionId;
	}
	
}
