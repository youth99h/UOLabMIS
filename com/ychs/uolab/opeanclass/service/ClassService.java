/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.opeanclass.service;

import java.util.List;

import com.ychs.uolab.opeanclass.vo.ClassPojo;
import com.ychs.uolab.opeanclass.vo.OpeanClass;

/**
 * 公开课业务接口
 * @author  侯博文
 * @version 1.0
 */
public interface ClassService {
	/**
	 * 添加公开课
	 * @param opeanclass 公开课对象
	 * @return 如果成功返回true，否则返回false
	 */
	public boolean addClass(OpeanClass opeanclass);
	
	/**
	 * 组合查询
	 * @param cid 编号
	 * @param date 日期
	 * @param dept 院系
	 * @param major 专业
	 * @param grade 年级
	 * @return 符合条件的结果集
	 */
	public List<ClassPojo> findClass(int cid, String date, String dept, String major, String grade);
}
