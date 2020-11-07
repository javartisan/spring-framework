package com.javartisan.spring.repo;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@Component
public class AsyncSimpleApplicationEventMulticaster extends SimpleApplicationEventMulticaster {

	@Autowired
	private ContextRefreshedEventListener contextRefreshedEventListener;

	public AsyncSimpleApplicationEventMulticaster() {
		setTaskExecutor(Executors.newSingleThreadExecutor(new ThreadFactory() {
			@Override
			public Thread newThread(@NotNull Runnable r) {
				Thread t = new Thread(r);
				t.setName("Spring-ContextRefreshedEventListener-Worker-1");
				return t;
			}
		}));
	}


	@Override
	public void multicastEvent(ApplicationEvent event) {
		multicastEvent(event, null);
	}

	@Override
	public void multicastEvent(ApplicationEvent event, ResolvableType eventType) {
		if (event instanceof ContextRefreshedEvent) {
			getTaskExecutor().execute(() -> contextRefreshedEventListener.onApplicationEvent((ContextRefreshedEvent) event));
		}
	}
}
