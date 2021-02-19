/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.classes.service;

import java.util.List;

import com.ychs.uolab.classes.dao.ClassDao;
import com.ychs.uolab.classes.dao.ClassDaoImpl;
import com.ychs.uolab.classes.vo.Classes;

/**
 * 班级接口实现类
 * @author  侯博文
 * @version 1.0
 */
public class ClassServiceImpl implements ClassService{
	
	private ClassDao cd = new ClassDaoImpl();

	@Override
	public List<Classes> findClass(int cno, int majorid) {
		List<Classes> cList = cd.selectClass(cno, majorid);
		
		return cList;
	}

	@Override
	public boolean addClass(Classes classes) {
		boolean flag = cd.insertClass(classes);
		
		return flag;
	}
	
}
