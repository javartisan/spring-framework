package com.javartisan.spring.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class IgnoreInterfaceBean implements IgnoreInterface {


	private List<String> list;

	private Set<String> set;

	public List<String> getList() {
		return list;
	}

	public Set<String> getSet() {
		return set;
	}

	@Autowired
	@Override
	public void setList(List<String> list) {
		this.list = list;
	}

	@Autowired
	@Override
	public void setSet(Set<String> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "IgnoreInterfaceBean{" +
				"list=" + list +
				", set=" + set +
				'}';
	}
}
