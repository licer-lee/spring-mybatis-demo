package com.liwc.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwc.mapper.AccountMapper;
import com.liwc.model.Account;
import com.liwc.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper mapper;
	
	
	@Override
	public Account find(int id) {
		return mapper.byId(id);
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Account t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateById(Account t) {
		// TODO Auto-generated method stub
		return 0;
	}




}
