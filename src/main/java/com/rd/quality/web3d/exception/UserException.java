package com.rd.quality.web3d.exception;
/**
 * @description 封装异常,操作数据库时遇到的异常
 * 				spring事务回滚默认发现runtimeException异常时才事务回滚，
 * 				runtimeException,有众多的子类。但是我们不需要用户看到。
 * 				其中DataAccessException为spring默认的数据库事务回滚异常
 * @author AlexLee
 * @createTime 2013-3-26 下午1:53:41
 * 
 * @TypeName com.rd.quality.web3d.exception.OperateDBException
 */
public class UserException extends RuntimeException{
	
	private static final long serialVersionUID = -4424328775640278495L;

	public UserException(String message) {
		super(message);
	}
	public UserException(String message,Throwable throwable) {
		super(message,throwable);
	}
}
