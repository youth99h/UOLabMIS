/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.member.test;

import java.util.List;
import java.util.Scanner;

import com.ychs.uolab.member.service.MemberService;
import com.ychs.uolab.member.service.MemberServiceImpl;
import com.ychs.uolab.member.vo.Member;
import com.ychs.uolab.member.vo.Pojo;

/**
 * 查询测试
 * @author  侯博文
 * @version 1.0
 */
public class FindMemerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "李小玉";
		
		String grade = "2019";
		
		String telephone = "18800000000";
		
		String campusPost = "团支书";
		
		String lj = "项目组长";
		
		String status = "正常";
		
		int cno = 19030401;
		
		int major = 1;
		
		int did = 1;
		
		MemberService m = new MemberServiceImpl();
		List<Pojo> mlist = m.findMember(name, grade, telephone, campusPost, lj, status, cno, major, did);
		
		for (int i = 0; i < mlist.size(); i++) {
			Pojo member = mlist.get(i);
			System.out.println(member);
		}
	}
}
