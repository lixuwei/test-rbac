package com.lee.study.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rd.quality.web3d.dao.UserDao;
import com.rd.quality.web3d.domain.Department;
import com.rd.quality.web3d.domain.User;
import com.rd.quality.web3d.exception.UserException;
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
		user.setUserName("lixuwei8");
		user.setLoginName("xuwe8");
		user.setPassword("mima");
		user.setCellphone("111");
		user.setEmail("@xuwei");
		user.setUserType("监理");
		Department department = new Department();
		department.setDepartmentId(1);
		user.setDepartment(department);
		
		boolean flag = false;
		try {
			flag = userService.save(user);
		} catch (UserException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(flag);
	}
	@Test
	public void TestFindUserById(){
		
		try {
			User user  = userService.findUserById(3);
			System.out.println(user.getUserId() + user.getLoginName());
		} catch (UserException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestFindUserByName(){
		
		try {
			User user  = userService.findUserByName("lixuwei1");
			System.out.println(user.getUserId() + user.getLoginName());
		} catch (UserException e) {
			e.printStackTrace();
		}
	}
	@Autowired
	private UserDao userDao;
	@Test
	public void TestFindUserDaoByName(){
		
		userDao.findByUserName("lixuwei1").get(0);

	}
	
}
