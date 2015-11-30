package com.lx.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务提供者
 * @author lx
 * @date 2015年9月9日 上午12:44:18
 */
public class Provider {
	 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext-dubbo-provider.xml"});
        context.start();
 
        System.in.read(); // 按任意键退出
    }
 
}