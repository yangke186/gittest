package cn.itcast.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springboot.mapper.UserMapper;
import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> queryUserByNameLike(String userName) {
		return userMapper.queryUserByNameLike(userName);
	}

	@Override
	public List<User> queryUsers() {
		return userMapper.queryUsers();
	}

}
