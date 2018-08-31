package cn.aplin1.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.aplin1.common.CommonPage;
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
	public String list(ModelMap map,String name,CommonPage commonPage) {
		
		
		
		PageInfo<Permission> Permissions = permissionService.getListByPage(name, commonPage);
		map.addAttribute("Permissions", Permissions);
		map.addAttribute("name", name);
		
		return "/permission/admin-permission";
	}
	
	
	@RequestMapping("/toAdd")
	public String toAdd(ModelMap map) {
		List<Permission> all = permissionService.getAll();
		map.addAttribute("all", all);
		return "/permission/admin-permission-add";
	}
	
	@RequestMapping("/add")
	public @ResponseBody ResponseResult add(HttpServletRequest request) {
		String des = request.getParameter("des");
		String parentId = request.getParameter("parentId");
		String leven = request.getParameter("leven");
		String type = request.getParameter("type");
		String permissionUrl = request.getParameter("permissionUrl");
		String permissionKey = request.getParameter("permissionKey");
		String name = request.getParameter("name");
		Permission permission=new Permission();
		permission.setDes(des);
		permission.setLeven(Integer.parseInt(leven));
		permission.setName(name);
		permission.setParentId(Integer.parseInt(parentId));
		permission.setPermissionKey(permissionKey);
		permission.setPermissionUrl(permissionUrl);
		permission.setType(Integer.parseInt(type));
		
		permissionService.add(permission);
		
		return new ResponseResult(ResponseEnum.RESULT_SUCCESS, "ok");
	}
	
	@RequestMapping("/del")
	public @ResponseBody ResponseResult del(Long id) {
		permissionService.deleteById(id);
		return new ResponseResult(ResponseEnum.RESULT_SUCCESS, "ok");
	}
	

	
}
