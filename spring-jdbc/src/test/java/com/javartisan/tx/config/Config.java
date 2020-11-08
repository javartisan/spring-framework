package com.javartisan.tx.config;

import org.h2.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Properties;

@ComponentScan(value = {"com.javartisan.tx"})
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class Config {

	private DataSource dataSource;

	@Bean(name = "dataSource")
	public DataSource initDataSource() {
		if (dataSource != null) {
			return dataSource;
		}
		Properties props = new Properties();
		props.setProperty("maxActive", "200");
		props.setProperty("maxIdle", "20");
		props.setProperty("maxWait", "30000");
		try {
			dataSource = new SimpleDriverDataSource(new Driver(), "jdbc:h2:mem:artisan", props);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataSource;
	}


	/**
	 * 实现接口方法，使得返回数据库事务管理器
	 */
	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		//设置事务管理器管理的数据源
		transactionManager.setDataSource(initDataSource());
		return transactionManager;
	}
}
