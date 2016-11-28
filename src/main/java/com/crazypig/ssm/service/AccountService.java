package com.crazypig.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crazypig.ssm.dao.AccountDao;
import com.crazypig.ssm.domain.Account;

@Service
public class AccountService extends BaseService<Account> {

	@Autowired
	private AccountDao dao;
	
	public List<Account> queryAll() throws Exception {
		return dao.queryAll();
	}

	public AccountDao getDao() {
		return dao;
	}

	public void setDao(AccountDao dao) {
		this.dao = dao;
	}
	
	
}
