package com.rd.quality.web3d.doamin;

import java.io.Serializable;
import java.util.List;
/**
 * @description 角色表 
 *
 * @author      Alex Lee
 * @createTiem  2013-3-25 下午8:15:34
 *
 * @TypeName com.rd.quality.web3d.doamin.Role
 */
public class Role implements Serializable{


	private static final long serialVersionUID = -1210096414425911427L;
	
	private int roleId;
	private String roleName;
	private String roleInfo;
	/**
	 * 在这里我们实现角色查功能，没有功能查角色的道理
	 */
	private List<RoleFunction> roleFunctions;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<RoleFunction> getRoleFunctions() {
		return roleFunctions;
	}

	public void setRoleFunctions(List<RoleFunction> roleFunctions) {
		this.roleFunctions = roleFunctions;
	}

	public String getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(String roleInfo) {
		this.roleInfo = roleInfo;
	}

}
