/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.competition.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.competition.vo.Competition;
import com.ychs.uolab.user.vo.User;
import com.ychs.uolab.util.DbUtil;
import com.ychs.uolab.util.Md5Util;

/**
 * CompetitionDao接口实现类
 * @author  侯博文
 * @version 1.0
 */
public class CompetitionDaoImpl implements CompetitionDao{

	@Override
	public List<Competition> selectCompetition(String year) {
		
		Connection conn = DbUtil.getConnection();
		Statement stmt = null;// 非预编译
		ResultSet rs = null;
		
		
		List<Competition> userList = new ArrayList<Competition>();
		
		// 因为不知道用户具体选择几个标准查询，所以SQL动态变化
		String sql = "SELECT * FROM t_competition WHERE 1=1 ";
		//可变字符串类
		StringBuilder strBuilder = new StringBuilder(sql);
		if(year != null) {
			strBuilder.append(" AND year='" + year + "'");
		}
		
		sql = strBuilder.toString();
		System.out.println(sql);
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //执行查询
			//把rs结果集里的数据转移到集合userlist中
			while(rs.next()) {
				Competition c = new Competition();
				//rs.get里的username是数据库表里字段
				c.setC_id(rs.getInt("c_id"));
				c.setCategories(rs.getString("categories"));
				c.setYear(rs.getString("year"));
				c.setTopic(rs.getString("topic"));
				c.setGroupleader(rs.getString("groupleader"));
				c.setGroupmember(rs.getString("groupmember"));
				c.setAward(rs.getString("award"));
				c.setAdviser(rs.getString("adviser"));
				c.setRemark(rs.getString("remark"));
				userList.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, null, conn);
		}
		
		return userList;
	}

	@Override
	public int updateCompetition(Competition competition) {
		
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		int count = 0;
		    
		try {
		  String sql = "UPDATE t_competition SET groupmember=?,award=? WHERE c_id=?";
		  pstmt = conn.prepareStatement(sql);
		  pstmt.setString(1, competition.getGroupmember());
		  pstmt.setString(2, competition.getAward());
		  pstmt.setInt(3, competition.getC_id());

		  // count表示的是 执行的SQL影响到的记录行数
		  count = pstmt.executeUpdate();
		} catch (SQLException e) {
		  e.printStackTrace();
		} finally {
		  DbUtil.closeResource(null, pstmt, conn);
	 }
		    
	 return count;

	}

	@Override
	public boolean insertCompetition(Competition competition) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		conn = DbUtil.getConnection();
		String sql = "INSERT INTO t_competition VALUES(?,?,?,?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, competition.getC_id());
			pstmt.setString(2, competition.getCategories());
			pstmt.setString(3, competition.getYear());
			pstmt.setString(4, competition.getTopic());
			pstmt.setString(5, competition.getGroupleader());
			pstmt.setString(6, competition.getGroupmember());
			pstmt.setString(7, competition.getAward());
			pstmt.setString(8, competition.getAdviser());
			pstmt.setString(9, competition.getRemark());
	
			//这个方法执行insert,update,delete
			//如果执行成功返回非0int,失败返回0
			int count = pstmt.executeUpdate();
			if(count != 0) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}
		
		
		return flag;
	}
	
}
