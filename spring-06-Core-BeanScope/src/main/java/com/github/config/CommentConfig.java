package com.github.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.github")
//@ComponentScan(basePackages = {"com.github.proxy", "com.github.service", "com.github.repository"})
public class CommentConfig {
}
