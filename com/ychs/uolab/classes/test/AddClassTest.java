/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.classes.test;

import java.util.Scanner;

import com.ychs.uolab.classes.service.ClassService;
import com.ychs.uolab.classes.service.ClassServiceImpl;
import com.ychs.uolab.classes.vo.Classes;

/**
 * 测试添加
 * @author  侯博文
 * @version 1.0
 */
public class AddClassTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入班级编号：");
		int cid = sc.nextInt();
		
		System.out.println("请输入专业编号：");
		int mid = sc.nextInt();
		
		System.out.println("请输入班级名称：");
		String name = sc.next();
		
		System.out.println("请输入人数：");
		int num = sc.nextInt();
		
		ClassService cs = new ClassServiceImpl();
		
		Classes c = new Classes(cid, mid, name, num);
		
		boolean flag = cs.addClass(c);
		
		if(flag) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
}
