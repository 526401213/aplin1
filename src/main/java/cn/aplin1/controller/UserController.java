package cn.aplin1.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.aplin1.common.ResponseEnum;
import cn.aplin1.common.ResponseResult;
import cn.aplin1.domain.User;
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
		
		
		return "/permission/admin-list";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		
		return "/permission/admin-add";
	}
	
	@RequestMapping("/add")
	public @ResponseBody ResponseResult add(User user) {
		user.setCreateTime(new Date());
		uservice.insert(user);
		
		return new ResponseResult(ResponseEnum.RESULT_SUCCESS, "ok");
	}
	
	
}
