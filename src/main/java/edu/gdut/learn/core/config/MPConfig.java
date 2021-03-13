package edu.gdut.learn.core.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//配置类注解
public class MPConfig {

    @Bean//把实例化注解注入到IOC中
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }

    @Bean
    //分页查询配置
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
