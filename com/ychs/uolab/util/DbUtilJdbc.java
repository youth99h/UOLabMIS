/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 实现数据库的链接与关闭
 * @author  侯博文
 * @version 1.0
 */
public class DbUtilJdbc {
	/**
	 * 获得数据库链接
	 * @return 得到的数据库链接对象
	 */
	public static Connection getConnection() {
		// 声明链接变量
		Connection conn = null;
		//注册数据库驱动:MYSQL8的驱动MYSQL5的不需要cj
		try {
			//原生的JDBC开发
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取链接,第一参数链接字符串，第二参数数据库用户名，第三参数数据库密码
			//uolabdb表示数据库名
			//3306数据库端口
			//localhost本机，当期就是自己的计算机
			//jdbc是一种协议，mysql是子协议
			String url = "jdbc:mysql://localhost:3306/uolabdb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
			//DriverManager 驱动程序管理类
			conn = DriverManager.getConnection(url, "root", "hbw12178");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	/**
	 * 关闭数据库链接
	 * @param conn 得到的数据库链接对象
	 */
	public static void closeConnection(Connection conn) {
		//防止空指针异常
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 单元测试，对两个方法做测试
	 * @param args 外界传入的参数
	 */
	public static void main(String[] args) {
		Connection conn = DbUtilJdbc.getConnection();
		System.out.println(conn);
		//内存泄露
		DbUtilJdbc.closeConnection(conn);
	}
}
