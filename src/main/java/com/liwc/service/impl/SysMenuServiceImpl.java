package com.liwc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwc.mapper.SysMenuMapper;
import com.liwc.model.SysMenu;
import com.liwc.service.SysMenuService;

@Service
public class SysMenuServiceImpl implements SysMenuService {

	@Autowired
	private SysMenuMapper mapper;
	
	
	@Override
	public SysMenu find(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysMenu> findAll() {
		return null;
//		return mapper.;
		
	}

	@Override
	public void save(SysMenu t) {
		int count = mapper.insert(t);
	}

	@Override
	public Map<String, Object> delete(int id) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		int effectCount = mapper.deleteByPrimaryKey(id);;
		map.put("msg", "deleted!");
		map.put("effectCount", effectCount);
		
		return map;
	}

	@Override
	public int updateById(SysMenu t) {
		return mapper.updateByPrimaryKey(t);
	}





}
