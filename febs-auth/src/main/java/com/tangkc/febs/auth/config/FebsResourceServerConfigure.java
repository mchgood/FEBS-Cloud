package com.tangkc.febs.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @Auther: tangkc
 * @Date: 2020/3/21
 * @Description: 资源服务器的配置类
 */
@Configuration
// 标记为资源
@EnableResourceServer
public class FebsResourceServerConfigure extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                //表明该安全配置对所有请求都生效
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/**").authenticated();
    }
}
