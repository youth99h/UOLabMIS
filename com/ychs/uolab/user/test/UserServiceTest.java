/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.user.test;

import java.util.Scanner;

import com.ychs.uolab.user.service.UserService;
import com.ychs.uolab.user.service.UserServiceImpl;
import com.ychs.uolab.user.vo.User;

/**
 * 测试UserService（单元测试）添加
 * @author  侯博文
 * @version 1.0
 */
public class UserServiceTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入用户名编号：");
		String uid = sc.next();
		
		System.out.println("请输入用户名：");
		//键盘接收数据
		String uname = sc.next();
		
		System.out.println("请输入用户密码：");
		//键盘接收数据
		String upsw = sc.next();
		
		UserService userService = new UserServiceImpl();
		User user = new User(Integer.parseInt(uid), uname, upsw, null, null, null, null, null, null, null, null, null, null, null);
		boolean flag = userService.addUser(user);
		
		if(flag) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
		
	}
}
