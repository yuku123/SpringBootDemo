package com.wisely.highlight_spring4.summary.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //1
@ComponentScan("com.wisely.highlight_spring4.summary.dependency") //2 对包进行扫描
public class DiConfig {
    //会把ServiceInjection类

}
