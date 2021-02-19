/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.member.test;

import java.util.Scanner;

import com.ychs.uolab.member.service.MemberService;
import com.ychs.uolab.member.service.MemberServiceImpl;
import com.ychs.uolab.member.vo.Member;

/**
 * 添加测试
 * @author  侯博文
 * @version 1.0
 */
public class AddMemberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入成员编号：");
		int memberid = sc.nextInt();
		
		System.out.println("请输入学号：");
		String stuid = sc.next();
		
		System.out.println("请输入姓名：");
		String stuname = sc.next();
		
		System.out.println("请输入班级：");
		int cno = sc.nextInt();
		
		System.out.println("请输入性别：");
		String sex = sc.next();
		
		System.out.println("请输入年级：");
		String grade = sc.next();
		
		System.out.println("请输入籍贯：");
		String place = sc.next();
		
		System.out.println("请输入电话：");
		String telephone = sc.next();
		
		System.out.println("请输入邮箱：");
		String email = sc.next();
		
		System.out.println("请输入校内职务：");
		String cp = sc.next();
		
		System.out.println("请输入加入时间：");
		String jd = sc.next();
		
		System.out.println("请输入状态：");
		String status = sc.next();
		
		System.out.println("请输入实验室职务：");
		String lj = sc.next();
		
		System.out.println("请输入备注：");
		String remark = sc.next();
		
		MemberService memberService = new MemberServiceImpl();
		Member member = new Member(memberid, cno, stuname, stuid, sex, grade, place, telephone, email, cp, jd, status, lj, remark);
		
		boolean flag = memberService.addMember(member);
		
		if(flag) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
}
