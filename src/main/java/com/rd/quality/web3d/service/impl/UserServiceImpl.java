package com.rd.quality.web3d.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rd.quality.web3d.dao.UserDao;
import com.rd.quality.web3d.domain.User;
import com.rd.quality.web3d.exception.UserException;
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
	public boolean save(User user) throws UserException {
		boolean flag = false; 
		int result = 0;
		try {
			result = userDao.save(user);
		} catch (Exception e) {
			throw new UserException("保存用户时出错喽",e);
		}
		if(result > 0){
			flag = true;
		}
		return flag;
	}


	@Override
	public User findUserById(int userId) throws UserException {
		User user = null;
		try {
			user = userDao.findById(userId);			
		} catch (Exception e) {
			throw new UserException("通过id查询User时出错喽",e);
		}
		return user;
	}

	@Override
	public User findUserByName(String name) throws UserException {
		User user = null;
		try {
			user = userDao.findByLoginName(name);
			//如果要加上判断用户名登录时在加上，但是这个用户名可能有多个值，
			//所以应该使用selectList
			/*if(user == null){
				user = userDao.findByUserName(name);
			}*/
		} catch (Exception e) {
			throw new UserException("通过name查询User时出错喽",e);
		}
		return user;
	}
}
