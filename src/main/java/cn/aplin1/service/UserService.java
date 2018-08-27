package cn.aplin1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.aplin1.dao.UserMapper;
import cn.aplin1.domain.User;

@Service
public class UserService {

	
	
	@Autowired
	private UserMapper userMapper;
	
	
	public void insert(User user) {
		userMapper.insertSelective(user);
	}
	
	
	
}
