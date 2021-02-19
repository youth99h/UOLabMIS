/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.opeanclass.dao;

import java.util.List;

import com.ychs.uolab.opeanclass.vo.ClassPojo;
import com.ychs.uolab.opeanclass.vo.OpeanClass;

/**
 * classDao接口
 * @author  侯博文
 * @version 1.0
 */
public interface ClassDao {
	/**
	 * 添加公开课
	 * @param opeanclass 公开课对象
	 * @return 如果成功返回true，否则返回false
	 */
	public boolean insertClass(OpeanClass opeanclass);
	
	/**
	 * 组合条件查询
	 * @param cid 编号
	 * @param date 日期
	 * @param dept 院系
	 * @param major 专业
	 * @param grade 年级
	 * @return 查询的集合
	 */
	public List<ClassPojo> selectClass(int cid, String date, String dept, String major, String grade);
}
