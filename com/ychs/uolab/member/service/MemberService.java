/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.member.service;

import java.util.List;

import com.ychs.uolab.member.vo.Member;
import com.ychs.uolab.member.vo.Pojo;

/**
 * 成员业务接口
 * @author  侯博文
 * @version 1.0
 */
public interface MemberService {
	/**
	 * 添加成员
	 * @param member 成员对象
	 * @return  成功返回1失败返回0
	 */
	public boolean addMember(Member member);
	
	/**
	 * 修改成员信息
	 * @param member 成员对象
	 * @return 成功返回1失败返回0
	 */
	public int modifyMember(Member member);
	
	/**
	 * 组合条件查询
	 * @param stuName 姓名
	 * @param grade 年级
	 * @param telephone 电话
	 * @param campusPost 校内职务
	 * @param labJob 实验室职务
	 * @param status 状态
	 * @param cno 班号
	 * @param major 专业编号
	 * @param did 院系编号
	 * @return 满足条件的集合List  
	 */
	public List<Pojo> findMember(String stuName, String grade, String telephone, String campusPost, String labJob, String status, int cno, int major, int did);
}
