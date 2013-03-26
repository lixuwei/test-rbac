package com.rd.quality.web3d.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rd.quality.web3d.dao.DepartmentDao;
import com.rd.quality.web3d.domain.Department;
import com.rd.quality.web3d.exception.DepartmentException;
import com.rd.quality.web3d.service.DepartmentService;
/**
 * @description 部门的业务操作类
 * @author AlexLee
 * @createTime 2013-3-26 下午4:35:11
 * 
 * @TypeName com.rd.quality.web3d.service.impl.DepartmentServiceImpl
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDao departmentDao;
	
	@Override
	public Department findDepartment(int departmentId) throws DepartmentException {
		
		Department department = null;
		try {
			department = departmentDao.findDepartmentAndUserById(departmentId);			
		} catch (Exception e) {
			throw new DepartmentException("获取Department失败",e);
		}
		return department;
	}

}
