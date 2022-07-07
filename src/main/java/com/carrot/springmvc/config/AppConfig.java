package com.carrot.springmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DBConfig.class, JavaConfigMyBatis.class})
public class AppConfig {
}
