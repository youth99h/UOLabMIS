/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.department.service;

import com.ychs.uolab.department.vo.Dept;
import com.ychs.uolab.department.vo.Major;

/**
 * 院系业务接口
 * @author  侯博文
 * @version 1.0
 */
public interface DeptService {
	/**
	 * 添加院系业务方法
	 * @param dept 院系
	 * @return 成功返回1，否则返回0
	 */
	public int addDept(Dept dept);
	
	/**
	 * 添加专业
	 * @param major 专业对象
	 * @return 成功返回1，否则返回0
	 */
	public int addMajor(Major major);
}
