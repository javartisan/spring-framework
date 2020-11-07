package com.javartisan.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@ComponentScan(value = {"com.javartisan.spring.repo"})
@Configuration
@EnableAspectJAutoProxy
public class ConfigRepo {

	@Bean
	public List<String> list() {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		return list;
	}

	@Bean
	public Set<String> set() {
		Set<String> set = new HashSet<>();
		set.add("1");
		set.add("2");
		return set;
	}
}
