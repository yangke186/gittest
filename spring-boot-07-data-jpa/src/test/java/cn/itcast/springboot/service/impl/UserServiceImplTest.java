package cn.itcast.springboot.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testFindByUserNameLikeOrderByAgeDesc() {
		List<User> list = userService.findByUserNameLikeOrderByAgeDesc("%雷%");
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testSave() {
		User user = new User();
		user.setId(8L);
		user.setAccount("heima");
		user.setUserName("黑马2");
		user.setAge(12);
		
		User tmp = userService.save(user);
		System.out.println(tmp);
	}

}
