package org.springframework.core.env.javartisan;

import org.junit.Test;
import org.springframework.core.env.MapPropertySource;

import java.security.AccessControlException;
import java.util.Map;

import static org.springframework.core.env.StandardEnvironment.SYSTEM_PROPERTIES_PROPERTY_SOURCE_NAME;

public class MapPropertySourceTests {

	public Map<String, Object> getSystemProperties() {
		try {
			return (Map) System.getProperties();
		} catch (AccessControlException ex) {
			return null;
		}
	}


	@Test
	public void testMapPropertySource() {
		MapPropertySource mapPropertySource = new MapPropertySource(SYSTEM_PROPERTIES_PROPERTY_SOURCE_NAME, getSystemProperties());
		String name = mapPropertySource.getName();
		System.out.println(name);

		String[] propertyNames = mapPropertySource.getPropertyNames();
		for (String pName : propertyNames) {
			System.out.println(pName +" = " + mapPropertySource.getProperty(pName));
		}

	}

}
