package com.rd.quality.web3d.domain;

import java.io.Serializable;
/**
 * @description 功能表 
 *
 * @author      Alex Lee
 * @createTiem  2013-3-25 下午8:43:29
 *
 * @TypeName com.rd.quality.web3d.doamin.Function
 */
public class Function implements Serializable{

	private static final long serialVersionUID = -4279702773719033927L;

	private int functionId;
	/**
	 * 模块的id
	 */
	private int moduleId;
	
	private String functionName;
	
	private String url;
	

	public int getFunctionId() {
		return functionId;
	}

	public void setFunctionId(int functionId) {
		this.functionId = functionId;
	}


	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + functionId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Function other = (Function) obj;
		if (functionId != other.functionId)
			return false;
		return true;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	
	
}
