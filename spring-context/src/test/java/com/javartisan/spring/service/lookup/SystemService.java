package com.javartisan.spring.service.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class SystemService {

	@Autowired
	private StudentService studentServiceSameOne;

	// Lookup只能用于方法
//	@Lookup
//	private StudentService studentServiceDiff;


	/**
	 * lookup作用：
	 * lookup注解解决问题是：对于实例的某一个成员字段，如果每次都需要返回一个不同的实例的话，可以使用@lookup注解 。
	 * 使用场景：
	 * 对于有状态的操作可能需要每次都获取一个新的实例。
	 * 底层实现：
	 * 使用代理技术，底层会实现抽象方法，然后根据容器获取新的实例.
	 * 注意事项：被lookup返回的值在Spring容器中必须是原型的，即非单例。
	 *
	 * @return
	 */
	@Lookup
	public abstract StudentService studentServiceDiff();

	@Override
	public String toString() {
		return
				"studentServiceSameOne=" + studentServiceSameOne + "  " + studentServiceSameOne;
	}
}
