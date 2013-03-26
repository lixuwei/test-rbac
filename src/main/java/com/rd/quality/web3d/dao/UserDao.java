package com.rd.quality.web3d.dao;

import com.rd.quality.web3d.domain.User;
/**
 * @description 对用户操作的Mapper
 * @author AlexLee
 * @createTime 2013-3-26 上午10:22:06
 * 
 * @TypeName com.rd.quality.web3d.dao.UserDao
 */
public interface UserDao {
	/**
	 * 保存一个实体，并返回成功与否
	 * @param user
	 * @return
	 */
	public int save(User user);
	
}
