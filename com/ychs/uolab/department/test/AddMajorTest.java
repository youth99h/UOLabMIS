/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.department.test;

import java.util.Scanner;

import com.ychs.uolab.department.service.DeptService;
import com.ychs.uolab.department.service.DeptServiceImpl;
import com.ychs.uolab.department.vo.Major;

/**
 * 添加专业测试
 * @author  侯博文
 * @version 1.0
 */
public class AddMajorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入院系编号：");
		int did = sc.nextInt();
		
		System.out.println("请输入专业名称：");
		String majorName = sc.next();
		
		System.out.println("请输入备注：");
		String remark = sc.next();
		
		int majorId = (int)(Math.random() * 10000);
		
		Major major = new Major(majorId, majorName, did, remark);
		
		DeptService deptService = new DeptServiceImpl();
		int flag = deptService.addMajor(major);
		System.out.println(flag);
		
		
	}
}
