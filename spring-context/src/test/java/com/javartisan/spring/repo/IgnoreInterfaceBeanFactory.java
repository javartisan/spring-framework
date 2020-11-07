package com.javartisan.spring.repo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class IgnoreInterfaceBeanFactory implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		beanFactory.ignoreDependencyInterface(IgnoreInterface.class);
	}
}
