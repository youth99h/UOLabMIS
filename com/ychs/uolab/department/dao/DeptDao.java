/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.department.dao;

import com.ychs.uolab.department.vo.Dept;
import com.ychs.uolab.department.vo.Major;

/**
 * 院系管理Dao接口
 * @author  侯博文
 * @version 1.0
 */
public interface DeptDao {
	/**
	 * 添加院系
	 * @param dept 院系对象
	 * @return 成功返回1，否则返回0
	 */
	public int insertDept(Dept dept);
	
	/**
	 * 添加专业
	 * @param major 专业对象
	 * @return 成功返回1，否则返回0
	 */
	public int insertMajor(Major major);
}
