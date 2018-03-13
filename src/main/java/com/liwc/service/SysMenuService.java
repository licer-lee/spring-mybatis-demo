package com.liwc.service;

import java.util.List;
import java.util.Map;

import com.liwc.model.SysMenu;

public interface SysMenuService {

	
	SysMenu find(int id);

	List<SysMenu> findAll();
	
	void save(SysMenu t);
	
	Map<String, Object> delete(int id);
	
	int updateById(SysMenu t);
	
}
