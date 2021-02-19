/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.classes.test;

import java.util.List;
import java.util.Scanner;

import com.ychs.uolab.classes.service.ClassService;
import com.ychs.uolab.classes.service.ClassServiceImpl;
import com.ychs.uolab.classes.vo.Classes;
import com.ychs.uolab.user.vo.User;

/**
 * 测试查找
 * @author  侯博文
 * @version 1.0
 */
public class FindClassTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cno = 2;
		
		int majorid = 2;
		
		ClassService cs = new ClassServiceImpl();
		
		List<Classes> clist = cs.findClass(cno, majorid);
		
		for (int i = 0; i < clist.size(); i++) {
			Classes c = clist.get(i);
			System.out.println(c);
		}
	}
}
