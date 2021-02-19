/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.classes.vo;

/**
 * 班级实体类
 * @author  侯博文
 * @version 1.0
 */
public class Classes {
	private int cno;
	private int majorid;
	private String cname;
	private int num;
	
	public Classes() {
		super();
	}

	public Classes(int cno, int majorid, String cname, int num) {
		super();
		this.cno = cno;
		this.majorid = majorid;
		this.cname = cname;
		this.num = num;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getMajorid() {
		return majorid;
	}

	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Classes [cno=" + cno + ", majorid=" + majorid + ", cname=" + cname + ", num=" + num + "]";
	}
	
	
	
}
