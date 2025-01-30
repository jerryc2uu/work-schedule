package com.example.demo.config;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers("/api/hello").permitAll()  // '/api/hello'에 대한 접근 허용
                .anyRequest().authenticated()  // 그 외의 모든 요청에 대해서는 인증 필요
            .and()
            .formLogin();  // 로그인 폼 설정 (기본 로그인 페이지 제공)
        return http.build();
    }
}