package com.bicjo.core;

import java.util.HashMap;
import java.util.Map;

public class BeanHelperTest {

	public static void main(String[] args) {
		BeanHelper helper = new BeanHelper();

		Map<String, Object> properties = new HashMap<String, Object>();
		Asset asset = helper.populate(Asset.class, properties);

		System.out.println(asset);
	}

}
