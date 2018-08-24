package cn.aplin1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author 附耳聆听
 *
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
