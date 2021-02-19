/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.department.service;

import com.ychs.uolab.department.dao.DeptDao;
import com.ychs.uolab.department.dao.DeptDaoImpl;
import com.ychs.uolab.department.vo.Dept;
import com.ychs.uolab.department.vo.Major;

/**
 * 院系业务接口的实现类
 * @author  侯博文
 * @version 1.0
 */
public class DeptServiceImpl implements DeptService{
	private DeptDao deptdao = new DeptDaoImpl();

	@Override
	public int addMajor(Major major) {
		int flag = deptdao.insertMajor(major);
		
		return flag;
	}

	@Override
	public int addDept(Dept dept) {
		int flag = deptdao.insertDept(dept);
		
		return flag;
	}
	
}
