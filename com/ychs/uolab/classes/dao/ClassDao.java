/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.classes.dao;

import java.util.List;

import com.ychs.uolab.classes.vo.Classes;

/**
 * ClassDao接口
 * @author  侯博文
 * @version 1.0
 */
public interface ClassDao {
	/**
	 * 添加班级
	 * @param classes 班级对象
	 * @return 如果成功返回true，否则返回false
	 */
	public boolean insertClass(Classes classes);
	
	/**
	 * 查找班级
	 * @param cno 班级编号
	 * @param majorid 专业编号
	 * @return 被查到的集合List
	 */
	public List<Classes> selectClass(int cno, int majorid);
}
