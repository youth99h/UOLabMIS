/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.member.test;

import java.util.Scanner;

import com.ychs.uolab.member.service.MemberService;
import com.ychs.uolab.member.service.MemberServiceImpl;
import com.ychs.uolab.member.vo.Member;

/**
 * 测试修改成员
 * @author  侯博文
 * @version 1.0
 */
public class ModifyMemberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入用户编号：");
		int memberId = sc.nextInt();
		
		System.out.println("请输入电话：");
		String mobile = sc.next();
		
		System.out.println("请输入校内职务：");
		String campusPost = sc.next();
		
		System.out.println("请输入状态：");
		String status = sc.next();
		
		System.out.println("请输入实验室职务：");
		String labJob = sc.next();
		
		System.out.println("请输入备注：");
		String remark = sc.next();
		
		Member member = new Member();
		member.setTelephone(mobile);
		member.setCampusPost(campusPost);
		member.setStatus(status);
		member.setRemark(remark);
		member.setLabJob(labJob);
		member.setMemberId(memberId);
		
		MemberService me = new MemberServiceImpl();
		int count = me.modifyMember(member);
		
		if (count != 0) {
			System.out.println("修改成功");
		} else {
			System.out.println("修改失败");
		}
		
		
	}
}
