package cn.itcast.springboot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 当前为了处理jsp的页面的时候需要在引导类平级添加而且必须要继承SpringBootServletInitializer并重写configure
 */

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//接受web的请求；将请求转至Application引导类作为入口
		return builder.sources(Application.class);
	}

}
