package com.liwc.service;

import java.util.List;
import java.util.Map;

import com.liwc.model.Type;

public interface TypeService {

	
	Type find(int id);

	List<Type> findAll();
	
	void save(Type t);
	
	Map<String, Object> delete(int id);
	
	int updateById(Type t);
	
}
