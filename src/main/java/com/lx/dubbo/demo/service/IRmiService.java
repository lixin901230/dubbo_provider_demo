package com.lx.dubbo.demo.service;

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 * 	定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常 
 * 	在dubbo中，如果服务接口没有继承java.rmi.Remote接口，
 * 		缺省Dubbo将自动生成一个com.xxx.XxxService$Remote的接口，并继承java.rmi.Remote接口，并以此接口暴露服务，
 * 		但如果设置了<dubbo:protocol name="rmi" codec="spring" />，将不生成$Remote接口，而使用Spring的RmiInvocationHandler接口暴露服务，和Spring兼容。
 * 
 * @author lixin
 */
public interface IRmiService extends Remote {

	String sayHello(String name) throws RemoteException;
}
