package com.javartisan.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@ComponentScan(value = {"com.javartisan.spring"})
@Configuration
@EnableAspectJAutoProxy
public class CycleDependencyConfig {

}
