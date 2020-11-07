package com.javartisan.spring.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContainerHolderTestBean {

	@Autowired
	private ApplicationContextAware containerHolder;

	public ApplicationContextAware getContainerHolder() {
		return containerHolder;
	}

	public void setContainerHolder(ApplicationContextAware containerHolder) {
		this.containerHolder = containerHolder;
	}
}
