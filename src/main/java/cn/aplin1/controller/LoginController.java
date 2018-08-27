package cn.aplin1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.aplin1.common.ResponseEnum;
import cn.aplin1.common.ResponseResult;

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
	public @ResponseBody ResponseResult login() {
		
		
		return new ResponseResult(ResponseEnum.RESULT_SUCCESS, "成功");
	}
	
	
	
	
}
