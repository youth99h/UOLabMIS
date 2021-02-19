/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.competition.test;

import java.util.Scanner;

import com.ychs.uolab.competition.service.CompetitionService;
import com.ychs.uolab.competition.service.CompetitionServiceImpl;
import com.ychs.uolab.competition.vo.Competition;

/**
 * 增加测试
 * @author  侯博文
 * @version 1.0
 */
public class AddCompetitionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入竞赛编号：");
		int cid = sc.nextInt();
		
		System.out.println("请输入竞赛种类：");
		//键盘接收数据
		String cate = sc.next();
		
		CompetitionService c = new CompetitionServiceImpl();
		Competition com = new Competition(cid, cate, null, null, null, null, null, null, null);
		
		boolean flag = c.addCompetition(com);
		
		if(flag) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
}
