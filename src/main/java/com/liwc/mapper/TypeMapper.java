package com.liwc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.mybatis.spring.annotation.MapperScan;

import com.liwc.model.Type;

@MapperScan
public interface TypeMapper {

	Type byId(String id);

	List<Type> findAll();

	void save(Type t);
	
	@Delete("delete from ACCOUNT_TYPE where ACCOUNT_TYPE_ID = #{id}")
	void deleteById(String id);
	
}
