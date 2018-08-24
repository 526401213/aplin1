package cn.aplin1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录
 * @author 附耳聆听
 * 乐意相关禽对语，生香不断树交花
 */
@Controller
@RequestMapping("/index")
public class LoginController {

	
	@RequestMapping("/toLogin")
	public String toLogin() {
		
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		
		return "login";
	}
	
	
	
	
}
