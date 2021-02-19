/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.credit.vo;

/**
 * 学分实体类
 * @author  侯博文
 * @version 1.0
 */
public class Credit {
	private int creditId;
	private int memberId;
	private String stuId;
	private String Sname;
	private String Grade;
	private String dept;
	private int creditPoints;
	private String subject;
	private String getdate;
	private String entryperson;
	private String entrydate;
	private String remark;
	
	public Credit() {
		super();
	}
	
	public Credit(int creditId, int memberId, String stuId, String sname, String grade, String dept, int creditPoints,
			String subject, String getdate, String entryperson, String entrydate, String remark) {
		super();
		this.creditId = creditId;
		this.memberId = memberId;
		this.stuId = stuId;
		Sname = sname;
		Grade = grade;
		this.dept = dept;
		this.creditPoints = creditPoints;
		this.subject = subject;
		this.getdate = getdate;
		this.entryperson = entryperson;
		this.entrydate = entrydate;
		this.remark = remark;
	}
	
	public int getCreditId() {
		return creditId;
	}
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getGetdate() {
		return getdate;
	}
	public void setGetdate(String getdate) {
		this.getdate = getdate;
	}
	public String getEntryperson() {
		return entryperson;
	}
	public void setEntryperson(String entryperson) {
		this.entryperson = entryperson;
	}
	public String getEntrydate() {
		return entrydate;
	}
	public void setEntrydate(String entrydate) {
		this.entrydate = entrydate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "Credit [creditId=" + creditId + ", memberId=" + memberId + ", stuId=" + stuId + ", Sname=" + Sname
				+ ", Grade=" + Grade + ", dept=" + dept + ", creditPoints=" + creditPoints + ", subject=" + subject
				+ ", getdate=" + getdate + ", entryperson=" + entryperson + ", entrydate=" + entrydate + ", remark="
				+ remark + "]";
	}
	
	
	
}