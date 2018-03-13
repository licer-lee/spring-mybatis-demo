package com.liwc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liwc.model.SysMenu;
import com.liwc.service.SysMenuService;

@Controller
@RequestMapping("menu")
public class SysMenuController {

	@Autowired
	private SysMenuService service;


	@RequestMapping("/index")
	public String index(Model model){
		
		model.addAttribute("menus", service.findAll());
		return "menu/index";
	}
	
	
	@RequestMapping(value="get/{id}", method=RequestMethod.GET)
	@ResponseBody
	public SysMenu get(@PathVariable("id") int id){
		return service.find(id);
	}

	@RequestMapping(value="save", method=RequestMethod.POST)
	@ResponseBody
	public SysMenu save(SysMenu t){
		
		service.save(t);
		return t;
	}
	
	

	@ResponseBody
	@RequestMapping("list")
	public List<SysMenu> list(){
		return service.findAll();
	}
	
	@RequestMapping("delete/{id}")
	@ResponseBody
	public Map<String, Object> delete(@PathVariable("id") int id){
		return service.delete(id);
	}

	@RequestMapping("info/{id}")
	public String info(@PathVariable("id") int id, Model model){
		
		SysMenu t = service.find(id);
		model.addAttribute("t", t);
		return "menu/info";
		
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	@ResponseBody
	public SysMenu UpdateType(SysMenu t){
		
		service.updateById(t);
		return t;
	}
	
	

}
