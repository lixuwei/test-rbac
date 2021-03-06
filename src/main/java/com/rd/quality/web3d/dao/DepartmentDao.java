package com.rd.quality.web3d.dao;

import com.rd.quality.web3d.domain.Department;
/**
 * @description 对部门表操作的Mapper
 * @author AlexLee
 * @createTime 2013-3-26 上午10:21:36
 * 
 * @TypeName com.rd.quality.web3d.dao.DepartmentDao
 */
public interface DepartmentDao {
	/**
	 * 保存一个部门
	 * @param department
	 * @return 
	 */
	int save(Department department);
	
	/**
	 * 根据DepartmentId得到实体
	 * @param departmentId
	 * @return
	 */
	Department findById(int departmentId);
	
	/**
	 * 查询出当前Department所拥有的Users 
	 * @param departmentId
	 * @return
	 */
	Department findDepartmentAndUserById(int departmentId);
	
}
