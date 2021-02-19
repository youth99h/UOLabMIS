/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.competition.test;

import java.util.Scanner;

import com.ychs.uolab.competition.service.CompetitionService;
import com.ychs.uolab.competition.service.CompetitionServiceImpl;
import com.ychs.uolab.competition.vo.Competition;

/**
 * 测试修改
 * @author  侯博文
 * @version 1.0
 */
public class ModifyCompetitionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("请输入竞赛编号：");
		int cid = sc.nextInt();
		
		System.out.println("请输入组员：");
		String member = sc.next();
		
		System.out.println("请输入获奖等级：");
		String award = sc.next();
		
		Competition com = new Competition();
		com.setC_id(cid);
		com.setGroupmember(member);
		com.setAward(award);
		
		CompetitionService c = new CompetitionServiceImpl();
		int count = c.modifyCompetition(com);
		
		if(count != 0) {
			System.out.println("修改成功");
		} else {
			System.out.println("修改失败");
		}
		
	}
}
