package com.ermao.dm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author Ermao
 * Date: 2023/3/8 23:48
 */
@Configuration
public class JdbcConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.data")
    public DataSourceProperties dataDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource dataDataSource() {
        return dataDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }
    @Bean
    public JdbcTemplate dataJdbcTemplate(@Qualifier("dataDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    @ConfigurationProperties("spring.datasource.schema")
    public DataSourceProperties schemaDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource schemaDataSource() {
        return schemaDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

    @Bean
    public JdbcTemplate schemaJdbcTemplate(@Qualifier("schemaDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
