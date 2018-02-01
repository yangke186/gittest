package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import cn.itcast.springboot.properties.ItcastProperties;

/**
 * 如果是一个spring boot 项目那么必须要在引导类上面添加@SpringBootApplication是一个组合注解
 * 会将自动配置的那些组件自动配置并能够扫描到引导类所在的包及其子包的那些spring 注解
 * 
 * @EnableConfigurationProperties 可以加载自定义的配置类
 */
@SpringBootApplication
@EnableConfigurationProperties(ItcastProperties.class)
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setBannerMode(Mode.OFF);//设置启动的banner不显示
		springApplication.run(args);
	}

}
