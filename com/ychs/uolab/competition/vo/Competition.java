/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.competition.vo;

/**
 * 竞赛实体类
 * @author  侯博文
 * @version 1.0
 */
public class Competition {
	private int c_id;
	private String categories;
	private String year;
	private String topic;
	private String groupleader;
	private String groupmember;
	private String award;
	private String adviser;
	private String remark;
	
	public Competition() {
		super();
	}

	public Competition(int c_id, String categories, String year, String topic, String groupleader, String groupmember,
			String award, String adviser, String remark) {
		super();
		this.c_id = c_id;
		this.categories = categories;
		this.year = year;
		this.topic = topic;
		this.groupleader = groupleader;
		this.groupmember = groupmember;
		this.award = award;
		this.adviser = adviser;
		this.remark = remark;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getGroupleader() {
		return groupleader;
	}

	public void setGroupleader(String groupleader) {
		this.groupleader = groupleader;
	}

	public String getGroupmember() {
		return groupmember;
	}

	public void setGroupmember(String groupmember) {
		this.groupmember = groupmember;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public String getAdviser() {
		return adviser;
	}

	public void setAdviser(String adviser) {
		this.adviser = adviser;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Competition [c_id=" + c_id + ", categories=" + categories + ", year=" + year + ", topic=" + topic
				+ ", groupleader=" + groupleader + ", groupmember=" + groupmember + ", award=" + award + ", adviser="
				+ adviser + ", remark=" + remark + "]";
	}
	
	
	
	
}
