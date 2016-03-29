package org.eduami.javafaq.springjdbc.dao;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfiguration {

    @Bean
    public CarDao vehicleDao() {
        return new JdbcCarDao(dataSource());
    }

    @Bean
    public DataSource dataSource() {
    	BasicDataSource dataSource = new BasicDataSource(); // Using connection pools
        dataSource.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
        dataSource.setUrl("jdbc:mysql://localhost/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("Test@123");
        return dataSource;

    }
}
