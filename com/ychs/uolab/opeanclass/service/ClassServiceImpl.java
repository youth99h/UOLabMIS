/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.opeanclass.service;

import java.util.List;

import com.ychs.uolab.opeanclass.dao.ClassDao;
import com.ychs.uolab.opeanclass.dao.ClassDaoImpl;
import com.ychs.uolab.opeanclass.vo.ClassPojo;
import com.ychs.uolab.opeanclass.vo.OpeanClass;


/**
 * 公开课业务接口实现类
 * @author  侯博文
 * @version 1.0
 */
public class ClassServiceImpl implements ClassService {
	
	private ClassDao classDao = new ClassDaoImpl();

	@Override
	public List<ClassPojo> findClass(int cid, String date, String dept, String major, String grade) {
		List<ClassPojo> cList = classDao.selectClass(cid, date, dept, major, grade);
		
		return cList;
	}

	@Override
	public boolean addClass(OpeanClass opeanclass) {
		boolean flag = classDao.insertClass(opeanclass);
		
		return flag;
	}
	
}
