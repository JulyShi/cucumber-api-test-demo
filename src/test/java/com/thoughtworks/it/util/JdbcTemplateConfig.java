package com.thoughtworks.it.util;

import java.beans.ConstructorProperties;

@Configuration
public class JdbcTemplateConfig {

    @Primary
    @Bean("serviceADataSource")
    @ConstructorProperties("spring.datasource.serviceA")
    public HikariDataSource serviceADataSource(){
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Primary
    @Bean("serviceAJdbcTemplate")
    public JdbcTemplete serviceAJdbcTemplate(@Qualifier("serviceADataSource") DataSource dataSource ){
        return new JdbcTemplate(dataSource);
    }

    @Bean("serviceBDataSource")
    @ConstructorProperties("spring.datasource.serviceB")
    public HikariDataSource serviceBDataSource(){
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean("serviceBJdbcTemplate")
    public JdbcTemplete serviceBJdbcTemplate(@Qualifier("serviceBDataSource") DataSource dataSource ){
        return new JdbcTemplate(dataSource);
    }

}
