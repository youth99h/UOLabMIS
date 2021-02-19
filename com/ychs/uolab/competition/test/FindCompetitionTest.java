/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.competition.test;

import java.util.List;
import java.util.Scanner;

import com.ychs.uolab.competition.service.CompetitionService;
import com.ychs.uolab.competition.service.CompetitionServiceImpl;
import com.ychs.uolab.competition.vo.Competition;
import com.ychs.uolab.user.vo.User;

/**
 * 测试查询
 * @author  侯博文
 * @version 1.0
 */
public class FindCompetitionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String year = "2020-11-12";
		
		CompetitionService c = new CompetitionServiceImpl();
		
		List<Competition> clist = c.findCompetition(year);
		
		for (int i = 0; i < clist.size(); i++) {
			Competition com = clist.get(i);
			System.out.println(com);
		}
	}

}
