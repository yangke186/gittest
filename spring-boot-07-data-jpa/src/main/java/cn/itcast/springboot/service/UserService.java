package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.pojo.User;

public interface UserService {
	
	public List<User> findByUserNameLikeOrderByAgeDesc(String userName);
	
	public User save(User user);

}
