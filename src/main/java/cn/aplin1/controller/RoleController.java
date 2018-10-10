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
import cn.aplin1.domain.RolePermission;
import cn.aplin1.dto.PermissionDto;
import cn.aplin1.service.PermissionService;
import cn.aplin1.service.RolePermissionService;
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
	@Autowired
	private RolePermissionService rolePermissionService;
	
	
	@RequestMapping("/list")
	public String list() {
		
		
		return "/permission/admin-role";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd(ModelMap map) {
		List<PermissionDto> permissionDtos=permissionService.getPermissionData2();
		map.addAttribute("permissionDtos", permissionDtos);
		return "/permission/admin-role-add";
	}
	
	@RequestMapping("/add")
	public @ResponseBody ResponseResult add(String des,String name,Long[] permissionIds){
		Role role=new Role();
		role.setDes(des);
		role.setName(name);
		roleService.insert(role);
		for (Long permissionId : permissionIds) {
			RolePermission permission=new RolePermission();
			permission.setRoleId(role.getId());
			permission.setPermissionId(permissionId);
			rolePermissionService.insert(permission);
		}

		return new ResponseResult(ResponseEnum.RESULT_SUCCESS, "ok");
	}
	
	
	
	
	
	
	
	
}
