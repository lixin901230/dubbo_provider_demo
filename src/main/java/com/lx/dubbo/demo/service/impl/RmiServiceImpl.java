package com.lx.dubbo.demo.service.impl;

import java.rmi.RemoteException;

import com.lx.dubbo.demo.service.IRmiService;

public class RmiServiceImpl implements IRmiService {

	public String sayHello(String name) throws RemoteException {
		return "Hello " + name;
    }
}
