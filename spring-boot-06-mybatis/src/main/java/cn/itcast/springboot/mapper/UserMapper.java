package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.itcast.springboot.pojo.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from tb_user where user_name like '%${userName}%'")
	public List<User> queryUserByNameLike(@Param("userName")String userName);

	
	public List<User> queryUsers();
}
