/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
 * 数据库连接实用类，获取数据库连接，释放资源
 * @author  侯博文
 * @version 1.0
 */
public class DbUtil {
	static DataSource ds;
	// static在类加载时候就要执行,往JVM里加载（深入Java虚拟机，Java虚拟机规范）
	//在static块里不可使用非static属性
	static {
		Properties pro = new Properties();
		//配置文件必须放在src目录下
		InputStream in = DbUtil.class.getClassLoader().getResourceAsStream("druid.properties");
		//读取配置文件,内容读到pro
		try {
			pro.load(in);
			//ds就是连接池
			ds = DruidDataSourceFactory.createDataSource(pro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	/**
	 * 获取数据库链接
	 * @return 数据库连接对象
	 */
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	/**
	 * 关闭数据库资源
	 * @param rs 结果集
	 * @param pstmt 预编译对象
	 * @param conn 数据库链接
	 */
	public static void closeResource(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Connection connection = DbUtil.getConnection();
		System.out.println(connection);
	}
}
