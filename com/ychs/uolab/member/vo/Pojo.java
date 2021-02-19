/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.member.vo;

/**
 * 封装查询信息
 * @author  侯博文
 * @version 1.0
 */
public class Pojo {
	
	private String stuName;
	private String stuId;
	private String grade;
	private String telephone;	
	private String campusPost;
	private String labJob;	
	private String cname;
	private String major_name;
	private String dname;
	
	public Pojo() {
		super();
	}

	public Pojo(String stuName, String stuId, String grade, String telephone, String campusPost, String labJob,
			String cname, String major_name, String dname) {
		super();
		this.stuName = stuName;
		this.stuId = stuId;
		this.grade = grade;
		this.telephone = telephone;
		this.campusPost = campusPost;
		this.labJob = labJob;
		this.cname = cname;
		this.major_name = major_name;
		this.dname = dname;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCampusPost() {
		return campusPost;
	}

	public void setCampusPost(String campusPost) {
		this.campusPost = campusPost;
	}

	public String getLabJob() {
		return labJob;
	}

	public void setLabJob(String labJob) {
		this.labJob = labJob;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMajor_name() {
		return major_name;
	}

	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Pojo [stuName=" + stuName + ", stuId=" + stuId + ", grade=" + grade + ", telephone=" + telephone
				+ ", campusPost=" + campusPost + ", labJob=" + labJob + ", cname=" + cname + ", major_name="
				+ major_name + ", dname=" + dname + "]";
	}

	
	
	
	
	
}
