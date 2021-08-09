package com.wustzdy.gradle.moudle.demo.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.wustzdy.gradle.moudle.demo.data.mapper")
public class DemoDataConfiguration {
}
