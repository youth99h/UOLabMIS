/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.member.vo.Member;
import com.ychs.uolab.member.vo.Pojo;
import com.ychs.uolab.util.DbUtil;

/**
 * MmeberDao实现类
 * @author  侯博文
 * @version 1.0
 */
public class MemberDaoImpl implements MemberDao {
	@Override
	public List<Pojo> selectMember(String stuName, String grade, String telephone, String campusPost, String labJob,
			String status, int cno, int major, int did) {
		Connection conn = DbUtil.getConnection();
		Statement stmt = null;// 非预编译
		ResultSet rs = null;
		
		List<Pojo> mList = new ArrayList<Pojo>();
		// 因为不知道用户具体选择几个标准查询，所以SQL动态变化
		String sql = "SELECT * FROM t_labmember,t_class,t_major,t_department WHERE 1=1 ";
		//可变字符串类
		StringBuilder strBuilder = new StringBuilder(sql);
		if(stuName != null) {
			strBuilder.append(" AND stu_name='" + stuName + "'");
		}
		if(grade != null) {
			strBuilder.append(" AND grade='" + grade +"'");
		}
		if(telephone != null) {
			strBuilder.append(" AND telephone='" + telephone + "'");
		}
		if(campusPost != null) {
			strBuilder.append(" AND campus_post='" + campusPost + "'");
		}
		if(labJob != null) {
			strBuilder.append(" AND lab_job='" + labJob + "'");
		}
		if(status != null) {
			strBuilder.append(" AND status='" + status + "'");
		}
		if(cno != 0) {
			strBuilder.append(" AND t_class.cno='" + cno + "'");
		}
		if(major != 0) {
			strBuilder.append(" AND t_major.major_id='" + major + "'");
		}
		if(did != 0) {
			strBuilder.append(" AND t_department.did='" + did + "'");
		}
				
		sql = strBuilder.toString();
		System.out.println(sql);
				
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //执行查询
			//把rs结果集里的数据转移到集合userlist中
			while(rs.next()) {
				Pojo m = new Pojo();
				//rs.get里的username是数据库表里字段
				//m.setMemberId(rs.getInt("member_id"));
				//m.setCno(rs.getInt("cno"));
				m.setStuName(rs.getString("stu_name"));
				m.setStuId(rs.getString("stu_id"));
				//m.setSex(rs.getString("sex"));
				m.setGrade(rs.getString("grade"));
				//m.setNativePlace(rs.getString("native_place"));
				m.setTelephone(rs.getString("telephone"));
				//m.setEmail(rs.getString("email"));
				m.setCampusPost(rs.getString("campus_post"));
				//m.setJoiningDate(rs.getString("joining_date"));
				//m.setStatus(rs.getString("status"));
				m.setLabJob(rs.getString("lab_job"));
				//m.setRemark(rs.getString("remark"));
				m.setCname(rs.getString("cname"));
				m.setMajor_name(rs.getString("major_name"));
				m.setDname(rs.getString("dname"));
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
	public int updateMember(Member member) {
		 Connection conn = DbUtil.getConnection();
		 PreparedStatement pstmt = null;
		 int count = 0;
		 
		 try {
		      String sql = "UPDATE t_labmember SET telephone=?,campus_post=?,status=?,lab_job=?,remark=? WHERE member_id=?";
		      pstmt = conn.prepareStatement(sql);
		      pstmt.setString(1, member.getTelephone());
		      pstmt.setString(2, member.getCampusPost());
		      pstmt.setString(3, member.getStatus());
		      pstmt.setString(4, member.getLabJob());
		      pstmt.setString(5, member.getRemark());
		      pstmt.setInt(6, member.getMemberId());
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
	public boolean insertMember(Member member) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		conn = DbUtil.getConnection();
		
		String sql = "INSERT INTO t_labmember VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, member.getMemberId());
			pstmt.setInt(2, member.getCno());
			pstmt.setString(3, member.getStuName());
			pstmt.setString(4, member.getStuId());
			pstmt.setString(5, member.getSex());
			pstmt.setString(6, member.getGrade());
			pstmt.setString(7, member.getNativePlace());
			pstmt.setString(8, member.getTelephone());
			pstmt.setString(9, member.getEmail());
			pstmt.setString(10, member.getCampusPost());
			pstmt.setString(11, member.getJoiningDate());
			pstmt.setString(12, member.getStatus());
			pstmt.setString(13, member.getLabJob());
			pstmt.setString(14, member.getRemark());
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
