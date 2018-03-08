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
	
	@Delete("delete from account_type where account_type_id = #{id}")
	void deleteById(String id);
	
}
