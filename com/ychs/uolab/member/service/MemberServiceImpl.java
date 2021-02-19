/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.member.service;

import java.util.List;

import com.ychs.uolab.member.dao.MemberDao;
import com.ychs.uolab.member.dao.MemberDaoImpl;
import com.ychs.uolab.member.vo.Member;
import com.ychs.uolab.member.vo.Pojo;


/**
 * 成员业务实现类
 * @author  侯博文
 * @version 1.0
 */
public class MemberServiceImpl implements MemberService {
	private MemberDao memberDao = new MemberDaoImpl();
	
	@Override
	public List<Pojo> findMember(String stuName, String grade, String telephone, String campusPost, String labJob,
			String status, int cno, int major, int did) {
		List<Pojo> mList = memberDao.selectMember(stuName, grade, telephone, campusPost, labJob, status, cno, major, did);
		
		return mList;
	}

	@Override
	public int modifyMember(Member member) {
		int count = memberDao.updateMember(member);
		
		return count;
	}

	@Override
	public boolean addMember(Member member) {
		boolean flag = memberDao.insertMember(member);
		
		return flag;
	}
	
}
