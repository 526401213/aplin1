package cn.aplin1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.aplin1.dao.RolePermissionMapper;
import cn.aplin1.domain.RolePermission;

@Service
public class RolePermissionService {

	
	@Autowired
	private RolePermissionMapper rolePermissionMapper;
	
	
	public void insert(RolePermission permission) {
		rolePermissionMapper.insertSelective(permission);
	}
}
