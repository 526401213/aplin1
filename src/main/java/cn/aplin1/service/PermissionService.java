package cn.aplin1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.aplin1.dao.PermissionMapper;
import cn.aplin1.domain.Permission;

@Service
public class PermissionService {

	@Autowired
	private PermissionMapper permissionMapper;
	
	
	public void add(Permission permission) {
		permissionMapper.insertSelective(permission);
	}
	
	
	
}
