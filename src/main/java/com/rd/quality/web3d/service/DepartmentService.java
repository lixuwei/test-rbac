package com.rd.quality.web3d.service;

import com.rd.quality.web3d.domain.Department;
import com.rd.quality.web3d.exception.DepartmentException;


/**
 * @description 用户业务
 * @author AlexLee
 * @createTime 2013-3-26 上午10:34:10
 * 
 * @TypeName com.rd.quality.web3d.service.UserService
 */
public interface DepartmentService {
	
	/**
	 * 通过Id获取Department以及拥有的User
	 * @param departmentId
	 * @return
	 */
	Department findDepartment(int departmentId) throws DepartmentException;
}
