package com.lx.dubbo.demo.service.impl;

import com.lx.dubbo.demo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello " + name;
    }
}
