//package com.example.demojooq.config;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.jooq.ConnectionProvider;
//import org.jooq.impl.DataSourceConnectionProvider;
//import org.jooq.impl.DefaultConfiguration;
//import org.jooq.impl.DefaultDSLContext;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class JooqConfig {
//    @Bean
//    public DefaultDSLContext dslContext(DataSource dataSource) {
//        DefaultConfiguration configuration = new DefaultConfiguration();
//        configuration.set(connectionProvider(dataSource));
//        return new DefaultDSLContext(configuration);
//    }
//
//    @Bean
//    public ConnectionProvider connectionProvider(DataSource dataSource) {
//        return new DataSourceConnectionProvider(dataSource);
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder.create()
//                .url("jdbc:mysql://localhost:3306/manage_students")
//                .username("root")
//                .password("12345678")
//                .type(HikariDataSource.class)
//                .build();
//    }
//}
