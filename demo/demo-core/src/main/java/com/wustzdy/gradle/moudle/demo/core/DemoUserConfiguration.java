package com.wustzdy.gradle.moudle.demo.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.wustzdy.gradle.moudle.demo.core.bean"})
public class DemoUserConfiguration {
}
