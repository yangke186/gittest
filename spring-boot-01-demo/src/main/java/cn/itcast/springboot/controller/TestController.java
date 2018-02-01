package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.properties.ItcastProperties;

@RequestMapping("/test")
@RestController //组合注解；包含了@Controller 和 @ResponseBody
public class TestController {
	
	//方式1：
	@Autowired
	private Environment environment;
	
	//方式2：
	@Value("${cn.itcast.name}")
	private String itcastName;
	@Value("${cn.itcast.url}")
	private String itcastUrl;
	@Value("${com.itheima.name}")
	private String heimaName;
	
	//方式2：
	@Autowired
	private ItcastProperties itcastProperties;


	@RequestMapping("/hello3")
	//@ResponseBody
	public String test() {
		
		System.out.println("-------------------第1种读取方式environment--------------------------");
		System.out.println("cn.itcast.name的值为：" + environment.getProperty("cn.itcast.name"));
		System.out.println("cn.itcast.url的值为：" + environment.getProperty("cn.itcast.url"));
		System.out.println("com.itheima.name的值为：" + environment.getProperty("com.itheima.name"));
		System.out.println("-------------------第2种读取方式environment--------------------------");
		System.out.println("cn.itcast.name的值为：" + itcastName);
		System.out.println("cn.itcast.url的值为：" + itcastUrl);
		System.out.println("com.itheima.name的值为：" + heimaName);
		System.out.println("-------------------第3种读取方式environment--------------------------");
		System.out.println("cn.itcast.name的值为：" + itcastProperties.getName());
		System.out.println("cn.itcast.url的值为：" + itcastProperties.getUrl());
		return "Hello Spring Boot.";
	}
}
