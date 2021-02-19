/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.department.test;

import java.util.Scanner;

import com.ychs.uolab.department.service.DeptService;
import com.ychs.uolab.department.service.DeptServiceImpl;
import com.ychs.uolab.department.vo.Dept;

/**
 * 添加院系测试类
 * @author  侯博文
 * @version 1.0
 */
public class AddDeptTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入院系编号：");
		int did = sc.nextInt();
		
		System.out.println("请输入院系名字：");
		String dname = sc.next();
		
		System.out.println("请输入备注");
		String remark = sc.next();
		
		DeptService deptService = new DeptServiceImpl();
		Dept dept = new Dept(did, dname, remark);
		int flag = deptService.addDept(dept);
		if(flag == 0) {
			System.out.println("添加失败");
		} else {
			System.out.println("添加成功");
		}
	}
}
