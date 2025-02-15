/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.member.dao;

import java.util.List;

import com.ychs.uolab.member.vo.Member;
import com.ychs.uolab.member.vo.Pojo;

/**
 * MemberDao接口，封装对Member的操作
 * @author  侯博文
 * @version 1.0
 */
public interface MemberDao {
	/**
	 * 添加成员
	 * @param member 成员对象
	 * @return 成功返回1，否则返回0
	 */
	public boolean insertMember(Member member);
	
	/**
	 * 修改成员信息
	 * @param member 成员对象
	 * @return 修改成功返回1，失败返回0
	 */
	public int updateMember(Member member); 
	
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
	 * @return 查询的到的集合List  
	 */
	public List<Pojo> selectMember(String stuName, String grade, String telephone, String campusPost, String labJob, String status, int cno, int major, int did);
}
