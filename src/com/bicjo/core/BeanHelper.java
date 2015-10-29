package com.bicjo.core;

import java.util.Map;

public class BeanHelper {

	@SuppressWarnings("unchecked")
	<T extends Model> T populate(Class<T> clazz, Map<String, Object> properties) {

		Model model = null;
		try {
			model = clazz.newInstance();
			System.out.println("BeanUtils.populate(model, properties)");
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		return (T) model;
	}

}
