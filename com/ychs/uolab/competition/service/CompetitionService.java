/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.competition.service;

import java.util.List;

import com.ychs.uolab.competition.vo.Competition;

/**
 * 竞赛业务接口
 * @author  侯博文
 * @version 1.0
 */
public interface CompetitionService {
	/**
	 * 添加竞赛
	 * @param competition 竞赛对象
	 * @return 如果成功返回true，否则返回false
	 */
	public boolean addCompetition(Competition competition);
	
	/**
	 * 修改竞赛业务
	 * @param competition 竞赛对象
	 * @return 成功返回1，否则0
	 */
	public int modifyCompetition(Competition competition);
	
	/**
	 * 查询竞赛
	 * @param year 年度
	 * @return 成功返回1，否则0
	 */
	public List<Competition> findCompetition(String year);
}
