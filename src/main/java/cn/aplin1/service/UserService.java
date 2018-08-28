package cn.aplin1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.aplin1.dao.UserMapper;
import cn.aplin1.domain.User;
import cn.aplin1.domain.UserExample;
import cn.aplin1.domain.UserExample.Criteria;

@Service
public class UserService {

	
	
	@Autowired
	private UserMapper userMapper;
	
	
	public void insert(User user) {
		userMapper.insertSelective(user);
	}


	public User login(String password, String userName) {
		UserExample example=new UserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserNameEqualTo(userName)
		.andPassEqualTo(password);
		List<User> list = userMapper.selectByExample(example);
		if(list != null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	
	
	
}
