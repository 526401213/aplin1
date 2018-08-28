package cn.aplin1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.aplin1.common.ResponseEnum;
import cn.aplin1.common.ResponseResult;
import cn.aplin1.common.UserConstans;
import cn.aplin1.domain.User;
import cn.aplin1.service.UserService;

/**
 * 乐意相关禽对语，生香不断树交花
 * @author 附耳聆听
 * 登录
 */
@Controller
@RequestMapping("/index")
public class LoginController {

	
	@Autowired
	private UserService uservice;
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		
		
		return "login";
	}
	
	
	@RequestMapping("/login")
	public @ResponseBody ResponseResult login(HttpServletRequest request,String password,String userName) {
		User b=uservice.login(password,userName);
		if(b == null) {
			return new ResponseResult(ResponseEnum.RESULT_FAIL, "账号或者密码错误");
		}
		request.getSession().setAttribute(UserConstans.USER_SESSION, b);
		return new ResponseResult(ResponseEnum.RESULT_SUCCESS, "成功");
	}
	
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		return "welcome";
	}
	
}
