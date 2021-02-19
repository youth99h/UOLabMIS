/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.credit.test;

import java.util.Scanner;

import com.ychs.uolab.credit.service.CreditService;
import com.ychs.uolab.credit.service.CreditServiceImpl;
import com.ychs.uolab.credit.vo.Credit;

/**
 * 测试录入
 * @author  侯博文
 * @version 1.0
 */
public class AddCreditTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入学分编号：");
		int cid = sc.nextInt();
		
		System.out.println("请输入实验室成员编号：");
		int mid = sc.nextInt();
		
		CreditService cs = new CreditServiceImpl();
		
		Credit c = new Credit(cid, mid, null, null, null, null, 0, null, null, null, null, null);
		boolean flag = cs.addCredit(c);
		
		if(flag) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
}
