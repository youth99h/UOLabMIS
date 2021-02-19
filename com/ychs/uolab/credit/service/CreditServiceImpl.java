/*
 * 中北大学软件学院版权所有
 */
package com.ychs.uolab.credit.service;

import java.util.List;

import com.ychs.uolab.credit.dao.CreditDao;
import com.ychs.uolab.credit.dao.CreditDaoImpl;
import com.ychs.uolab.credit.vo.Credit;
import com.ychs.uolab.credit.vo.CreditPojo;

/**
 * 学分业务实现类
 * @author  侯博文
 * @version 1.0
 */
public class CreditServiceImpl implements CreditService {
	
	private CreditDao cr = new CreditDaoImpl();

	@Override
	public List<CreditPojo> findCount(String id, String name, String getdate, String entrydate) {
		List<CreditPojo> countlist = cr.selectCount(id, name, getdate, entrydate);
		
		return countlist;
	}

	@Override
	public List<Credit> findCredit(String id, String name, String getdate, String entrydate) {
		List<Credit> clist = cr.selectCredit(id, name, getdate, entrydate);
		
		return clist;
	}

	@Override
	public boolean addCredit(Credit credit) {
		boolean flag = cr.insertCredit(credit);
		
		return flag;
	}
	
}
