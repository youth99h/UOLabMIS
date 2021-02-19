/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.credit.service;

import java.util.List;

import com.ychs.uolab.credit.vo.Credit;
import com.ychs.uolab.credit.vo.CreditPojo;

/**
 * 学分业务接口
 * @author  侯博文
 * @version 1.0
 */
public interface CreditService {
	/**
	 * 录入学分接口
	 * @param credit 学分对象
	 * @return 如果成功返回true，否则返回false
	 */
	public boolean addCredit(Credit credit);
	
	/**
	 * 查询学分接口
	 * @param id 学号
	 * @param name 姓名
	 * @param getdate 开始日期
	 * @param entrydate 结束日期
	 * @return 查询的集合
	 */
	public List<Credit> findCredit(String id, String name, String getdate, String entrydate);
	
	/**
	 * 查询总学分接口
	 * @param id 学号
	 * @param name 姓名
	 * @param getdate 开始日期
	 * @param entrydate 结束日期
	 * @return 查询的集合
	 */
	public List<CreditPojo> findCount(String id, String name, String getdate, String entrydate);
}
