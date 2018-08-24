package cn.aplin1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 轻声悠扬弹,不尽长夜的凄凉
 * @author 附耳聆听
 * 用户模块
 */
@Controller
@RequestMapping("/user")
public class UserController {

	
	
	@RequestMapping("/list")
	public String list() {
		
		
		return "";
	}
	
}
