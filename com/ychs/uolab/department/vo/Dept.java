/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.department.vo;

/**
 * 院系类
 * @author  侯博文
 * @version 1.0
 */
public class Dept {
	private int did;
	private String dname;
	private String remark;
	
	public Dept() {
		super();
	}

	public Dept(int did, String dname, String remark) {
		super();
		this.did = did;
		this.dname = dname;
		this.remark = remark;
	}

	public Dept(String dname, String remark) {
		super();
		this.dname = dname;
		this.remark = remark;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", remark=" + remark + "]";
	}
	
	
	
}
