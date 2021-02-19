/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.opeanclass.test;

import java.util.List;
import java.util.Scanner;

import com.ychs.uolab.opeanclass.service.ClassService;
import com.ychs.uolab.opeanclass.service.ClassServiceImpl;
import com.ychs.uolab.opeanclass.vo.ClassPojo;

/**
 * 测试查询
 * @author  侯博文
 * @version 1.0
 */
public class FindClassTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cid = 500;
		
		String date = "2020-12-28";
		
		String grade = "2019";
		
		String major = "软件工程";
		
		String dept = "软件学院";
		
		ClassService cs = new ClassServiceImpl();
		List<ClassPojo> list = cs.findClass(cid, date, dept, major, grade);
		
		for (int i = 0; i < list.size(); i++) {
			ClassPojo cp = list.get(i);
			System.out.println(cp);
		}
 		
	}
}
