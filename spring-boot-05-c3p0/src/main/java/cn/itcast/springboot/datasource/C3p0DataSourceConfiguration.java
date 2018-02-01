package cn.itcast.springboot.datasource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class C3p0DataSourceConfiguration {

	@Bean("dataSource")
	@Primary //如果有多个数据源的时候；以当前这个为主
	@ConfigurationProperties(prefix="c3p0")//该配置的参数名称来自于ComboPooledDataSource类的属性名称
	public DataSource getDataSource() {
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
	}
}
