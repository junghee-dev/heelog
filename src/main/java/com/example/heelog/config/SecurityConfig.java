//package com.example.heelog.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // 모든 요청에 대해 인증을 요구하지 않도록 설정
//        http
//                .authorizeRequests()
//                .antMatchers("/**").permitAll() // 모든 경로에 대한 접근을 허용
//                .anyRequest().authenticated() // 그 외의 요청은 인증 필요
//                .and()
//                .csrf().disable(); // CSRF 보호 비활성화 (선택 사항)
//    }
//}