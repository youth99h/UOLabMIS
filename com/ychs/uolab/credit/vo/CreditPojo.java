/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.credit.vo;

/**
 * 总分实体
 * @author  侯博文
 * @version 1.0
 */
public class CreditPojo {
	private int count;

	public CreditPojo() {
		super();
	}

	public CreditPojo(int count) {
		super();
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "CreditPojo [count=" + count + "]";
	}
	
	
}
