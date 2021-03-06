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

import com.liwc.model.Account;
import com.liwc.model.Type;
import com.liwc.service.AccountService;

@Controller
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService ts;


	@RequestMapping("/index")
	public String index(Model model){
		
		model.addAttribute("types", ts.findAll());
		
		return "type/index";
	}
	
	
	@RequestMapping(value="get/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Account getType(@PathVariable("id") int id){
		return ts.find(id);
	}

	@RequestMapping(value="save", method=RequestMethod.POST)
	@ResponseBody
	public Account save(Account t){
		
		ts.save(t);
		return t;
	}
	
	

	@ResponseBody
	@RequestMapping("list")
	public List<Account> list(){
		return ts.findAll();
	}
	
	@RequestMapping("delete/{id}")
	@ResponseBody
	public Map<String, Object> delete(@PathVariable("id") int id){
		return ts.delete(id);
	}

	@RequestMapping("info/{id}")
	public String info(@PathVariable("id") int id, Model model){
		
		Account t = ts.find(id);
		model.addAttribute("t", t);
		return "type/info";
		
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	@ResponseBody
	public Account UpdateType(Account t){
		
		ts.updateById(t);
		return t;
	}
	
	

}
