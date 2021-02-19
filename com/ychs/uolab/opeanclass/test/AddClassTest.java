/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.opeanclass.test;

import java.util.Scanner;

import com.ychs.uolab.opeanclass.service.ClassService;
import com.ychs.uolab.opeanclass.service.ClassServiceImpl;
import com.ychs.uolab.opeanclass.vo.OpeanClass;

/**
 * 录入公开课
 * @author  侯博文
 * @version 1.0
 */
public class AddClassTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入公开课编号：");
		int cid = sc.nextInt();
		
		System.out.println("请输入课程群体：");
		//键盘接收数据
		String show = sc.next();
		
		ClassService classservice = new ClassServiceImpl();
		
		OpeanClass c = new OpeanClass(cid, null, null, null, null, null, show, null, 0, 0, null);
		
		boolean flag = classservice.addClass(c);
		
		if(flag) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
}
