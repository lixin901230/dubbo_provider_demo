package com.lx.dubbo.demo.service.impl;

import com.lx.dubbo.demo.service.ICxfWebService;

public class CxfWebServiceImpl implements ICxfWebService {

	public String sayHello(String name) {
		return "Hello " + name;
    }
}
