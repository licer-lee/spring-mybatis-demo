package com.liwc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwc.mapper.TypeMapper;
import com.liwc.model.Type;
import com.liwc.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeMapper mapper;
	
	
	@Override
	public Type find(int id) {
		return mapper.byId(id);
	}

	@Override
	public List<Type> findAll() {
		return mapper.findAll();
	}

	@Override
	public void save(Type t) {
		int count = mapper.save(t);
	}

	@Override
	public Map<String, Object> delete(int id) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		int effectCount = mapper.deleteById(id);;
		map.put("msg", "deleted!");
		map.put("effectCount", effectCount);
		
		return map;
	}

	@Override
	public int updateById(Type t) {
		return mapper.updateById(t);
	}





}
