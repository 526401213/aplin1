package cn.aplin1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.aplin1.dao.RoleMapper;
import cn.aplin1.domain.Role;

@Service
public class RoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	
	public void insert(Role role) {
		roleMapper.insertSelective(role);
	}
	
	
}
