/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.user.test;

import java.util.Scanner;

import com.ychs.uolab.user.service.UserService;
import com.ychs.uolab.user.service.UserServiceImpl;
import com.ychs.uolab.util.Md5Util;

/**
 * 登录测试类
 * @author  侯博文
 * @version 1.0
 */
public class LoginTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入用户名：");
		String uname = sc.next();
		
		System.out.println("请输入密码：");
		String upsw = sc.next();
		
		String newPsw = Md5Util.getMD5(upsw);
		UserService userService = new UserServiceImpl();
		boolean flag = userService.checkUser(uname, newPsw);
		if(flag) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}
			
		
	}
}
