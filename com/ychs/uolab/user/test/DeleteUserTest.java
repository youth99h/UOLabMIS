/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.user.test;

import java.util.Scanner;

import com.ychs.uolab.user.service.UserService;
import com.ychs.uolab.user.service.UserServiceImpl;

/**
 * 删除用户测试类
 * @author  侯博文
 * @version 1.0
 */
public class DeleteUserTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户编号：");
		String userid = sc.next();
		
		UserService us = new UserServiceImpl();
		int count = us.deleteUser(userid);
		System.out.println(count);
		
	}
}
