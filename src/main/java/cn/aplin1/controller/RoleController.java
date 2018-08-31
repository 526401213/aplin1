package cn.aplin1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.aplin1.common.ResponseEnum;
import cn.aplin1.common.ResponseResult;
import cn.aplin1.domain.Role;
import cn.aplin1.dto.PermissionDataDto;
import cn.aplin1.service.PermissionService;
import cn.aplin1.service.RoleService;

/**
 * 沧海何尝断地脉，朱涯从此破天荒。
 * @author 附耳聆听
 * 角色模块
 */
@Controller
@RequestMapping("/role")
public class RoleController {

	
	@Autowired
	private RoleService roleService;
	@Autowired
	private PermissionService permissionService;
	
	@RequestMapping("/list")
	public String list() {
		
		
		return "/permission/admin-role";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd(ModelMap map) {
		List<PermissionDataDto> dtos=permissionService.getPermissionData();
		map.addAttribute("dtos", dtos);
		return "/permission/admin-role-add";
	}
	
	@RequestMapping("/add")
	public @ResponseBody ResponseResult add(Role role){
		roleService.insert(role);
		
		return new ResponseResult(ResponseEnum.RESULT_SUCCESS, "ok");
	}
	
	
	
	
	
	
	
	
}
