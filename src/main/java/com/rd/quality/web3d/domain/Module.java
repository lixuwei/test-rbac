package com.rd.quality.web3d.domain;

import java.io.Serializable;
/**
 * @description 模块表 
 *
 * @author      Alex Lee
 * @createTiem  2013-3-25 下午10:18:07
 *
 * @TypeName com.rd.quality.web3d.doamin.Module
 */
public class Module implements Serializable{

	private static final long serialVersionUID = 1640212143610163189L;

	private int moduleId;
	private String moduleName;
	
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
}
