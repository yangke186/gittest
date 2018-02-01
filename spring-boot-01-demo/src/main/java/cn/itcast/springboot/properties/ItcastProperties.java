package cn.itcast.springboot.properties;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties 在自定义的Java类上面添加，表示读取application.properties配置文件的配置项
 * prefix 表示application.properties配置文件的配置项的前缀
 * ignoreUnknownFields 表示如果在application.properties配置文件中存在的配置项，
 * 在java类又没有对应的属性进行匹配的话，设置为true则表示忽略，如果false表示不忽略，若出现次情形则报错
 * 
 * 在使用了@ConfigurationProperties注解的类如果要生效的话；需要在引导类上面指定
 *
 */
@ConfigurationProperties(prefix= "cn.itcast", ignoreUnknownFields= true)
public class ItcastProperties implements Serializable {
	
	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
