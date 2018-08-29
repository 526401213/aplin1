package cn.aplin1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.aplin1.common.ResponseEnum;
import cn.aplin1.common.ResponseResult;
import cn.aplin1.domain.Permission;
import cn.aplin1.service.PermissionService;

/**
 * 待我弦断音垮,许你青丝白发
 * @author 附耳聆听
 * 权限模块
 */
@Controller
@RequestMapping("/permission")
public class PermissionController  {

	@Autowired
	private PermissionService permissionService;
	
	
	@RequestMapping("/list")
	public String list() {
		
		
		return "/permission/admin-permission";
	}
	
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		
		return "/permission/admin-permission-add";
	}
	
	@RequestMapping("/add")
	public @ResponseBody ResponseResult add(Permission permission) {
		permissionService.add(permission);
		
		return new ResponseResult(ResponseEnum.RESULT_SUCCESS, "ok");
	}
	

	
}
