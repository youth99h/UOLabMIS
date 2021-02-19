/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.competition.dao;

import java.util.List;

import com.ychs.uolab.competition.vo.Competition;

/**
 * CompetitionDao接口
 * @author  侯博文
 * @version 1.0
 */
public interface CompetitionDao {
	/**
	 * 录入竞赛
	 * @param competition 竞赛对象
	 * @return 如果成功返回true，否则返回false
	 */
	public boolean insertCompetition(Competition competition);
	
	/**
	 * 修改信息
	 * @param competition 竞赛对象
	 * @return 如果成功返回true，否则返回false
	 */
	public int updateCompetition(Competition competition);
	
	/**
	 * 查询竞赛
	 * @param year 年度
	 * @return 查询的集合
	 */
	public List<Competition> selectCompetition(String year);
}
