package com.liwc.service;

import java.util.List;
import java.util.Map;

import com.liwc.model.Account;

public interface AccountService {

	
	Account find(int id);

	List<Account> findAll();
	
	void save(Account t);
	
	Map<String, Object> delete(int id);
	
	int updateById(Account t);
	
}
