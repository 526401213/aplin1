package cn.aplin1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.aplin1.service.UserService;

/**
 * 轻声悠扬弹,不尽长夜的凄凉
 * @author 附耳聆听
 * 用户模块
 */
@Controller
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService uservice;
	
	@RequestMapping("/list")
	public String list() {
		
		
		return "";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		
		return "";
	}
	
	@RequestMapping("/add")
	public String add() {
		
		return "";
	}
	
	
}
