/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.classes.service;

import java.util.List;

import com.ychs.uolab.classes.vo.Classes;

/**
 * 班级业务接口
 * @author  侯博文
 * @version 1.0
 */
public interface ClassService {
	/**
	 * 添加班级
	 * @param classes 班级对象
	 * @return 如果成功返回true，否则返回false
	 */
	public boolean addClass(Classes classes);
	
	/**
	 * 查找班级
	 * @param cno 班级编号
	 * @param majorid 专业编号
	 * @return 满足条件对象组成的集合
	 */
	public List<Classes> findClass(int cno, int majorid);
}
