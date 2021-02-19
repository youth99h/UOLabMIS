/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.classes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.classes.vo.Classes;
import com.ychs.uolab.user.vo.User;
import com.ychs.uolab.util.DbUtil;
import com.ychs.uolab.util.Md5Util;

/**
 * ClassDao实现类
 * @author  侯博文
 * @version 1.0
 */
public class ClassDaoImpl implements ClassDao {
	
	@Override
	public List<Classes> selectClass(int cno, int majorid) {
		Connection conn = DbUtil.getConnection();
		Statement stmt = null;// 非预编译
		ResultSet rs = null;
		List<Classes> userList = new ArrayList<Classes>();
		
		// 因为不知道用户具体选择几个标准查询，所以SQL动态变化
		String sql = "SELECT * FROM t_class WHERE 1=1 ";
		//可变字符串类
		StringBuilder strBuilder = new StringBuilder(sql);
		if(cno != 0) {
			strBuilder.append(" AND cno='" + cno + "'");
		}
		if(majorid != 0) {
			strBuilder.append(" AND major_id='" + majorid +"'");
		}
	
		
		sql = strBuilder.toString();
		System.out.println(sql);
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //执行查询
			//把rs结果集里的数据转移到集合userlist中
			while(rs.next()) {
				Classes c = new Classes();
				//rs.get里的username是数据库表里字段
				c.setCno(rs.getInt("cno"));
				c.setMajorid(rs.getInt("major_id"));
				c.setCname(rs.getString("cname"));
				c.setNum(rs.getInt("num"));
			
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
	public boolean insertClass(Classes classes) {
		
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		conn = DbUtil.getConnection();
		String sql = "INSERT INTO t_class VALUES(?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, classes.getCno());
			pstmt.setInt(2, classes.getMajorid());
			pstmt.setString(3, classes.getCname());
			pstmt.setInt(4, classes.getNum());

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
