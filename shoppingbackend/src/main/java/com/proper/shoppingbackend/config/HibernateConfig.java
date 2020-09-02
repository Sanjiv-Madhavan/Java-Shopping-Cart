package com.proper.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.proper.shoppingbackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	
	private static final String DB_URL="jdbc:h2:tcp://localhost/~/shopping";
	private static final String DB_DRIVER ="org.h2.Driver";
	private static final String DB_DIALECT ="org.hibernate.dialect.H2Dialect";
	private static final String DB_USER="sanjiv";
	private static final String DB_PASSWORD="";
	
	
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource datasource = new BasicDataSource();
		
		datasource.setUrl(DB_URL);
		datasource.setDriverClassName(DB_DRIVER);
		datasource.setUsername(DB_USER);
		datasource.setPassword(DB_PASSWORD);
		
		
		
		return datasource;
	}
	
	
	@Bean
	public SessionFactory getSessionFactory(DataSource datasource)
	{
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(datasource);
		
		
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.proper.shoppingbackend.dto");
		
		
		return builder.buildSessionFactory();
	}


	private Properties getHibernateProperties() {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		
		properties.put("hibernate.dialect", DB_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return properties;
	}
	
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	
}
