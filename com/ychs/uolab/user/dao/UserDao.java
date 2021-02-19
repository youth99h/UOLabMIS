/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.user.dao;

import java.util.List;

import com.ychs.uolab.user.vo.User;

/**
 * UserDao接口,封装对用户的操作
 * @author  侯博文
 * @version 1.0
 */
public interface UserDao {
	/**
	 * 按用户名和密码登录
	 * @param userName 用户名
	 * @param userPsw 密码
	 * @return 如果登陆成功返回true,否则返回false
	 */
	public boolean login(String userName, String userPsw);
	
	/**
	 * 添加用户
	 * @param user 用户对象
	 * @return 如果成功返回true，否则返回false
	 */
	public boolean insertUser(User user);
	
	/**
	 * 修改用户信息
	 * @param user 用户对象
	 * @return 修改成功返回1，失败返回0
	 */
	public int updateUser(User user);
	
	/**
	 * 删除用户
	 * @param userid 用户编号
	 * @return 删除成功返回1，失败返回0
	 */
	public int deleteUser(String userid);
	
	/**
	 * 组合条件查询
	 * @param uname 用户名
	 * @param dname 院系名
	 * @param major 专业
	 * @param classes 班级
	 * @param grade 年级
	 * @return 被查到的集合List
	 */
	public List<User> selectUser(String uname, String dname, String major, String classes, String grade);
}
