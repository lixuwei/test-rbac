package com.lee.study.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rd.quality.web3d.domain.Department;
import com.rd.quality.web3d.domain.User;
import com.rd.quality.web3d.service.UserService;

/**
 * @description 测试User
 * @author AlexLee
 * @createTime 2013-3-26 上午10:41:04
 * 
 * @TypeName com.lee.study.test.TestUserService
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestUserService {
	
	@Autowired
	private UserService userService;

	@Test
	public void TestSave(){
		
		User user  = new User();
		user.setUserName("lixuwei1");
		user.setLoginName("xuwei1");
		user.setPassword("mima");
		user.setCellphone("111");
		user.setEmail("@xuwei");
		user.setUserType("监理");
		Department department = new Department();
		department.setDepartmentId(1);
		user.setDepartment(department);
		
		int flag = userService.save(user);
		System.out.println(flag);
	}
	
}
