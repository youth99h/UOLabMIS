/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.credit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.credit.vo.Credit;
import com.ychs.uolab.credit.vo.CreditPojo;
import com.ychs.uolab.util.DbUtil;

/**
 * CreditDao接口实现类
 * @author  侯博文
 * @version 1.0
 */
public class CreditDaoImpl implements CreditDao{

	@Override
	public List<CreditPojo> selectCount(String id, String name, String getdate, String entrydate) {
		Connection conn = DbUtil.getConnection();
		Statement stmt = null;// 非预编译
		ResultSet rs = null;
		List<CreditPojo> countList = new ArrayList<CreditPojo>();
		
		// 因为不知道用户具体选择几个标准查询，所以SQL动态变化
		String sql = "SELECT SUM(credit_points) FROM t_credit WHERE 1=1 ";
		//可变字符串类
		StringBuilder strBuilder = new StringBuilder(sql);
		if(id != null) {
			strBuilder.append(" AND stu_id='" + id + "'");
		}
		if(name != null) {
			strBuilder.append(" AND sname='" + name +"'");
		}
		if(getdate != null) {
			strBuilder.append(" AND getdate='" + getdate + "'");
		}
		if(entrydate != null) {
			strBuilder.append(" AND entrydate='" + entrydate + "'GROUP BY stu_id");
		}
	
		sql = strBuilder.toString();
		System.out.println(sql);
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //执行查询
			//把rs结果集里的数据转移到集合userlist中
			while(rs.next()) {
				CreditPojo c = new CreditPojo();
				//rs.get里的username是数据库表里字段
				c.setCount(rs.getInt(1));
			
				countList.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, null, conn);
		}
		
		return countList;
	}

	@Override
	public List<Credit> selectCredit(String id, String name, String getdate, String entrydate) {
		Connection conn = DbUtil.getConnection();
		Statement stmt = null;// 非预编译
		ResultSet rs = null;
		List<Credit> cList = new ArrayList<Credit>();
		
		// 因为不知道用户具体选择几个标准查询，所以SQL动态变化
		String sql = "SELECT * FROM t_credit WHERE 1=1 ";
		//可变字符串类
		StringBuilder strBuilder = new StringBuilder(sql);
		if(id != null) {
			strBuilder.append(" AND stu_id='" + id + "'");
		}
		if(name != null) {
			strBuilder.append(" AND sname='" + name +"'");
		}
		if(getdate != null) {
			strBuilder.append(" AND getdate='" + getdate + "'");
		}
		if(entrydate != null) {
			strBuilder.append(" AND entrydate='" + entrydate + "'");
		}
	
		
		sql = strBuilder.toString();
		System.out.println(sql);
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //执行查询
			//把rs结果集里的数据转移到集合userlist中
			while(rs.next()) {
				Credit c = new Credit();
				//rs.get里的username是数据库表里字段
				c.setCreditId(rs.getInt("credit_id"));
				c.setMemberId(rs.getInt("member_id"));
				c.setStuId(rs.getString("stu_id"));
				c.setSname(rs.getString("sname"));
				c.setGrade(rs.getString("grade"));
				c.setDept(rs.getString("dept"));
				c.setCreditPoints(rs.getInt("credit_points"));
				c.setSubject(rs.getString("subject"));
				c.setGetdate(rs.getString("getdate"));
				c.setEntryperson(rs.getString("entryperson"));
				c.setEntrydate(rs.getString("entrydate"));
				c.setRemark(rs.getString("remark"));
				cList.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, null, conn);
		}
		
		return cList;
	}

	@Override
	public boolean insertCredit(Credit credit) {
		
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
			
		conn = DbUtil.getConnection();
		String sql = "INSERT INTO t_credit VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, credit.getCreditId());
			pstmt.setInt(2, credit.getMemberId());
			pstmt.setString(3, credit.getStuId());
			pstmt.setString(4, credit.getSname());
			pstmt.setString(5, credit.getGrade());
			pstmt.setString(6, credit.getDept());
			pstmt.setInt(7, credit.getCreditPoints());
			pstmt.setString(8, credit.getSubject());
			pstmt.setString(9, credit.getGetdate());
			pstmt.setString(10, credit.getEntryperson());
			pstmt.setString(11, credit.getEntrydate());
			pstmt.setString(12, credit.getRemark());
	
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
	

