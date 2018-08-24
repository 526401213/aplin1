package cn.aplin1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author 附耳聆听
 * 角色模块
 */
@Controller
@RequestMapping("/role")
public class PermissionController {

	
	@RequestMapping("/list")
	public String list() {
		
		
		return "";
	}
}
