package com.rd.quality.web3d.service;

import com.rd.quality.web3d.domain.User;
import com.rd.quality.web3d.exception.UserException;

/**
 * @description 用户业务
 * @author AlexLee
 * @createTime 2013-3-26 上午10:34:10
 * 
 * @TypeName com.rd.quality.web3d.service.UserService
 */
public interface UserService {
	/**
	 * 保存一个用户，返回成功与否
	 * @param user
	 * @return
	 */
	boolean save(User user) throws UserException;
	
	/**
	 * 根据userId查询出user
	 */
	User findUserById(int userid) throws UserException;
	
	/**
	 * 根据userName和loginName得到User
	 */
	User findUserByName(String name) throws UserException;
}
