package com.rd.quality.web3d.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rd.quality.web3d.dao.UserDao;
import com.rd.quality.web3d.domain.User;
import com.rd.quality.web3d.service.UserService;
/**
 * @description UserService实现类
 * @author AlexLee
 * @createTime 2013-3-26 上午10:36:02
 * 
 * @TypeName com.rd.quality.web3d.service.impl.UserServiceImpl
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	@Override
	public int save(User user) {

		int flag = userDao.save(user);
		
		return flag;
	}

}
