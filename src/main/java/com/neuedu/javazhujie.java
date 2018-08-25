package com.neuedu;


import com.neuedu.entity.JDBC;
import com.neuedu.service.adas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring-config.xml")
public class javazhujie {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public adas sas(){
        return new adas();
    }
    @Bean
    public JDBC jdbc(){
        JDBC jdbc=new JDBC();
        jdbc.setDriver(driver);
        jdbc.setUrl(url);
        jdbc.setUsername(username);
        jdbc.setPassword(password);
        return jdbc;
    }




}
