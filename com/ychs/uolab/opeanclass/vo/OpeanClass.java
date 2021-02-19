/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.opeanclass.vo;

/**
 * 公开课实体类
 * @author  侯博文
 * @version 1.0
 */
public class OpeanClass {
	private int cid;
	private String courseDate;
	private String special;
	private String speaker;
	private String organizer;
	private String site;
	private String groupShow;
	private String way;
	private int credit;
	private int num;
	private String remark;
	
	public OpeanClass() {
		super();
	}

	public OpeanClass(int cid, String courseDate, String special, String speaker, String organizer, String site,
			String groupShow, String way, int credit, int num, String remark) {
		super();
		this.cid = cid;
		this.courseDate = courseDate;
		this.special = special;
		this.speaker = speaker;
		this.organizer = organizer;
		this.site = site;
		this.groupShow = groupShow;
		this.way = way;
		this.credit = credit;
		this.num = num;
		this.remark = remark;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCourseDate() {
		return courseDate;
	}

	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getGroupShow() {
		return groupShow;
	}

	public void setGroupShow(String groupShow) {
		this.groupShow = groupShow;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "OpeanClass [cid=" + cid + ", courseDate=" + courseDate + ", special=" + special + ", speaker=" + speaker
				+ ", organizer=" + organizer + ", site=" + site + ", groupShow=" + groupShow + ", way=" + way
				+ ", credit=" + credit + ", num=" + num + ", remark=" + remark + "]";
	}
	
	
	
	
	
}
