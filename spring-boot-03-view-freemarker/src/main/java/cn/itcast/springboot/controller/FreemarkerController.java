package cn.itcast.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/fm")
@Controller
public class FreemarkerController {

	/**
	 * 在spring mvc的方法的形参的类型如果是map的话；那么在指定该类型的值的时候会将该方法的返回结果（model）的地址指给它
	 * 也就是形参中的map类型的地址与返回结果一致；与model是一样的效果；如果形参中有多个那么多个map都是同一个地址
	 * @param userId
	 * @param root
	 * @return
	 */
	@RequestMapping("/query/{userId}")
	public String queryUserById(@PathVariable Long userId, Map<String, Object> root) {
		root.put("userId", "传智播客id=" + userId);
		root.put("userName", "传智播客");
		
		//在模版的路径下存在user/list.ftl
		return "user/list";
	}
	
	/**
	 * @param userId
	 * @param root
	 * @return
	 */
	@RequestMapping("/query2/{userId}")
	public ModelAndView queryUserById2(@PathVariable Long userId) {
		ModelAndView mv = new ModelAndView("user/list");
		mv.addObject("userId", "传智播客id=" + userId);
		mv.addObject("userName", "传智播客");
		
		return mv;
	}
}
