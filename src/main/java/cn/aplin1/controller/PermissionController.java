package cn.aplin1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author 附耳聆听
 * 角色模块
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {

	
	@RequestMapping("/list")
	public String list() {
		
		
		return "/permission/admin-permission";
	}
	
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		
		return "/permission/admin-permission-add";
	}
	
	
}
