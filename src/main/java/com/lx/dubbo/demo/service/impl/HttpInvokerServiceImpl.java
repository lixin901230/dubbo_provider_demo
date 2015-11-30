package com.lx.dubbo.demo.service.impl;

import com.lx.dubbo.demo.service.IHttpInvokerService;

public class HttpInvokerServiceImpl implements IHttpInvokerService {

	public String sayHello(String name) {
		return "Hello " + name;
    }
}
