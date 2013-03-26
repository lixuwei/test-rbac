package com.lee.study.test;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.rd.quality.web3d.domain.Function;

/**
 * @description 比较两个对象相等 
 *
 * @author      Alex Lee
 * @createTiem  2013-3-25 下午8:48:26
 *
 * @TypeName com.lee.study.test.TestEqualsobj
 */
public class TestEqualsobj {

	@Test
	public void testEquals(){
		
		Function fun = new Function();
		Function fun2 = new Function();
		fun.setFunctionId(1);
		fun2.setFunctionId(1);
		
		Set<Function> f = new HashSet<Function>();
		f.add(fun2);
		f.add(fun);
		System.out.println(f.size());
	}
	
}
