/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.credit.test;

import java.util.List;
import java.util.Scanner;

import com.ychs.uolab.credit.service.CreditService;
import com.ychs.uolab.credit.service.CreditServiceImpl;
import com.ychs.uolab.credit.vo.Credit;
import com.ychs.uolab.credit.vo.CreditPojo;

/**
 * 测试查询
 * @author  侯博文
 * @version 1.0
 */
public class FindCreditTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "1913040128";
		
		String name = "李小玉";
		
		String get = "2021-01-05";
		
		String entry = "2021-01-25";
		
		CreditService cs = new CreditServiceImpl();
		
		List<Credit> c = cs.findCredit(id, name, get, entry);
		List<CreditPojo> count = cs.findCount(id, name, get, entry);
		
		for (int i = 0; i < c.size(); i++) {
			Credit ct = c.get(i);
			System.out.println(ct);
		}
		
		for (int t = 0; t < c.size(); t++) {
			CreditPojo cot = count.get(t);
			System.out.println(cot);
		}
 	}
}
