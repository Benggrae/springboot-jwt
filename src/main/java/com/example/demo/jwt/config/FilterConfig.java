package com.example.demo.jwt.config;

import com.example.demo.jwt.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter> filter1(){
        FilterRegistrationBean<MyFilter> bean = new FilterRegistrationBean<MyFilter>(new MyFilter());
        bean.addUrlPatterns("/*");
        bean.setOrder(0); // 최우선순위
        return bean;
    }
}
