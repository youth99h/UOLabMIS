/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.competition.service;

import java.util.List;

import com.ychs.uolab.competition.dao.CompetitionDao;
import com.ychs.uolab.competition.dao.CompetitionDaoImpl;
import com.ychs.uolab.competition.vo.Competition;

/**
 * 竞赛业务实现类
 * @author  侯博文
 * @version 1.0
 */
public class CompetitionServiceImpl implements CompetitionService{
	
	private CompetitionDao com = new CompetitionDaoImpl();

	@Override
	public List<Competition> findCompetition(String year) {
		List<Competition> clist = com.selectCompetition(year);
		
		return clist;
	}

	@Override
	public int modifyCompetition(Competition competition) {
		int count = com.updateCompetition(competition);
		
		return count;
	}

	@Override
	public boolean addCompetition(Competition competition) {
		boolean flag = com.insertCompetition(competition);
		
		return flag;
	}

}
