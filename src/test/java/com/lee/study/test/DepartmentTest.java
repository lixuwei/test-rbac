package com.lee.study.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rd.quality.web3d.domain.Department;
import com.rd.quality.web3d.service.DepartmentService;
/**
 * @description 测试Department表
 * @author AlexLee
 * @createTime 2013-3-26 下午4:51:27
 * 
 * @TypeName com.lee.study.test.DepartmentTest
 */
public class DepartmentTest extends BaseTest{

	@Autowired
	private DepartmentService departmentService;

	@Test
	public void testFindDepartment(){
		
		try {
			Department findDepartment = departmentService.findDepartment(1);
			String name = findDepartment.getUsers().get(0).getUserName();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
