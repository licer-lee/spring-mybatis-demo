package com.liwc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.mybatis.spring.annotation.MapperScan;

import com.liwc.model.Account;

@MapperScan
public interface AccountMapper {

	Account byId(int id);

	List<Account> findAll();

	int save(Account at);
	
	@Delete("delete from ACCOUNT where ID = #{id}")
	int deleteById(int id);
	
	
	int updateById(Account at);
}
