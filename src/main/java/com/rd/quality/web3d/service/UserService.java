package com.rd.quality.web3d.service;

import com.rd.quality.web3d.domain.User;

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
	int save(User user);
	
}
