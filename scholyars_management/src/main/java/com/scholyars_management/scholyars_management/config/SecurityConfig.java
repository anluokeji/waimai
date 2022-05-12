package com.scholyars_management.scholyars_management.config;
import com.scholyars_management.scholyars_management.security.LoginFailureHandler;

import com.scholyars_management.scholyars_management.security.CaptchaFilter;
import com.scholyars_management.scholyars_management.security.LoginSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter {
    @Autowired
    LoginFailureHandler loginFailureHandler;
    @Autowired
    CaptchaFilter captchaFilter;
    @Autowired
    LoginSuccessHandler loginSuccessHandler;
    public static final String[] URL_WHITELIST = {
            "/webjars/**",
            "/favicon.ico",

            "/captcha",
            "/login",
            "/logout",
    };
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .formLogin()
                .failureHandler(loginFailureHandler)

                .and()
                .authorizeRequests()
                .antMatchers(URL_WHITELIST).permitAll() //白名单
                .anyRequest().authenticated()






                // 不会创建 session
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)

                .and()
                .addFilterBefore(captchaFilter, UsernamePasswordAuthenticationFilter.class) // 登录验证码校验过滤器

                .formLogin()
                .failureHandler(loginFailureHandler)
                .successHandler(loginSuccessHandler)
        ;
    }


}
