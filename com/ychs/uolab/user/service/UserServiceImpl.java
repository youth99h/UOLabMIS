/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.user.service;

import java.util.List;

import com.ychs.uolab.user.dao.UserDao;
import com.ychs.uolab.user.dao.UserDaoImpl;
import com.ychs.uolab.user.vo.User;

/**
 * 用户业务实现类：用户登录
 * @author  侯博文
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
	
	/**
	 * UserDao对象在当前类里使用
	 */
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public List<User> findUser(String uname, String dname, String major, String classes, String grade) {
		List<User> uList = userDao.selectUser(uname, dname, major, classes, grade);
		
		return uList;
	}

	@Override
	public int deleteUser(String userid) {
		int count = userDao.deleteUser(userid);
		
		return count;
	}

	@Override
	public int modifyUser(User user) {
		int count = userDao.updateUser(user);
		
		return count;
	}

	@Override
	public boolean addUser(User user) {
		boolean flag = userDao.insertUser(user);
		
		return flag;
	}

	@Override
	public boolean checkUser(String userName, String userPsw) {
		//调用UserDao里的方法login
		boolean flag = userDao.login(userName, userPsw);
		
		return flag;
	}

}
