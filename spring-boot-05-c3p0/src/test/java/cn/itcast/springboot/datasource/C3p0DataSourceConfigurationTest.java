package cn.itcast.springboot.datasource;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class C3p0DataSourceConfigurationTest {
	
	@Autowired
	private DataSource dataSource;

	@Test
	public void testGetDataSource() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}

}
