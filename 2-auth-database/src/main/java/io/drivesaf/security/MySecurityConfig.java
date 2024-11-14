package io.drivesaf.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author: DRIVESAF
 * @createTime: 2024/11/14 19:05
 * @description:
 **/
@Configuration
@EnableWebSecurity // 开启 Spring Security
public class MySecurityConfig {
    /**
     * 密码编码器
     */
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}