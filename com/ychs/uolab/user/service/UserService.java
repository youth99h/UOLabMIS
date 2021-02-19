/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.user.service;

import java.util.List;

import com.ychs.uolab.user.vo.User;

/**
 * 用户业务接口：用户登录
 * @author  侯博文
 * @version 1.0
 */
public interface UserService {
	/**
	 * 按用户名密码检查用户
	 * @param userName 用户名
	 * @param userPsw 密码
	 * @return 登录成功返回true失败返回false
	 */
	public boolean checkUser(String userName, String userPsw); 
	
	/**
	 * 添加用户
	 * @param user 用户对象
	 * @return 如果成功返回true，否则返回false
	 */
	public boolean addUser(User user);
	
	/**
	 * 修改用户信息
	 * @param user 用户对象
	 * @return 成功返回1失败返回0
	 */
	public int modifyUser(User user);
	
	/**
	 * 按编号删除用户
	 * @param userid 用户编号
	 * @return 成功返回1失败返回0
	 */
	public int deleteUser(String userid);
	
	/**
	 * 组合条件查询
	 * @param uname 用户名
	 * @param dname 姓名
	 * @param major 院系
	 * @param classes 班级
	 * @param grade 年级
	 * @return 满足条件对象组成的集合
	 */
	public List<User> findUser(String uname, String dname, String major, String classes, String grade);
}
