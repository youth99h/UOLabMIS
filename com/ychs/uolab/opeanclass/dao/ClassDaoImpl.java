/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.opeanclass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.member.vo.Pojo;
import com.ychs.uolab.opeanclass.vo.ClassPojo;
import com.ychs.uolab.opeanclass.vo.OpeanClass;
import com.ychs.uolab.util.DbUtil;

/**
 * ClassDao接口实现类
 * @author  侯博文
 * @version 1.0
 */
public class ClassDaoImpl implements ClassDao{

	@Override
	public List<ClassPojo> selectClass(int cid, String date, String dept, String major, String grade) {
		Connection conn = DbUtil.getConnection();
		Statement stmt = null;// 非预编译
		ResultSet rs = null;
		
		List<ClassPojo> mList = new ArrayList<ClassPojo>();
		// 因为不知道用户具体选择几个标准查询，所以SQL动态变化
		String sql = "SELECT * FROM t_openclass,t_openclass_member,t_credit,t_labmember,t_major,t_class,t_department WHERE 1=1 ";
		StringBuilder strBuilder = new StringBuilder(sql);
		if (date != null) {
			strBuilder.append(" AND course_date='" + date + "'");
		} 
		if (grade != null) {
			strBuilder.append(" AND t_labmember.grade='" + grade + "'");
		}
		if (dept != null) {
			strBuilder.append(" AND dname='" + dept + "'");
		}
		if (major != null) {
			strBuilder.append(" AND t_major.major_name='" + major + "'");
		}
		strBuilder.append(" AND t_credit.member_id = t_labmember.member_id AND t_credit.member_id = t_labmember.member_id AND t_labmember.cno = t_class.cno GROUP BY t_openclass.cid");
		sql = strBuilder.toString();
		System.out.println(sql);
				
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //执行查询
			//把rs结果集里的数据转移到集合userlist中
			while(rs.next()) {
				ClassPojo m = new ClassPojo();
				//rs.get里的username是数据库表里字段
				m.setCid(rs.getInt("t_openclass.cid"));
				m.setSpecial(rs.getString("special"));
				m.setSpeaker(rs.getString("speaker"));
				m.setOrganizer(rs.getString("organizer"));
				m.setSite(rs.getString("site"));
				m.setGroupShow(rs.getString("group_show"));
				m.setWay(rs.getString("way"));
				m.setCredit(rs.getInt("credit"));
				m.setNum(rs.getInt("num"));
				m.setRemark(rs.getString("remark"));
				m.setDate(rs.getString("course_date"));
				m.setDept(rs.getString("dname"));
				m.setMajor(rs.getString("major_name"));
				m.setGrade(rs.getString("grade"));
				mList.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, null, conn);
		}
		
		return mList;
	}

	@Override
	public boolean insertClass(OpeanClass opeanclass) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		conn = DbUtil.getConnection();
		String sql = "INSERT INTO t_openclass VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, opeanclass.getCid());
			pstmt.setString(2, opeanclass.getCourseDate());
			pstmt.setString(3, opeanclass.getSpecial());
			pstmt.setString(4, opeanclass.getSpeaker());
			pstmt.setString(5, opeanclass.getOrganizer());
			pstmt.setString(6, opeanclass.getSite());
			pstmt.setString(7, opeanclass.getGroupShow());
			pstmt.setString(8, opeanclass.getWay());
			pstmt.setInt(9, opeanclass.getCredit());
			pstmt.setInt(10, opeanclass.getNum());
			pstmt.setString(11, opeanclass.getRemark());
		
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
