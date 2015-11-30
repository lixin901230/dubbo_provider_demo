
Dubbo缺省协议采用单一长连接和NIO异步通讯，适合于小数据量大并发的服务调用，以及服务消费者机器数远大于服务提供者机器数的情况。
Dubbo缺省协议不适合传送大数据量的服务，比如传文件，传视频等，除非请求量很低。
缺省协议，使用基于mina1.1.7+hessian3.2.1的tbremoting交互。
	连接个数：单连接
	连接方式：长连接
	传输协议：TCP
	传输方式：NIO异步传输
	序列化：Hessian二进制序列化
	适用范围：传入传出参数数据包较小（建议小于100K），消费者比提供者个数多，单一消费者无法压满提供者，尽量不要用dubbo协议传输大文件或超大字符串。
	适用场景：常规远程服务方法调用

示例介绍：
	本 dubbo 示例 使用的zookeeper版本：zookeeper-3.4.6（建议使用dubbo-2.3.3以上版本的zookeeper注册中心客户端）
	zookeeper客户端：
		本例使用zkclient客户端（Zookeeper支持zkclient和curator两种Zookeeper客户端实现）
		从2.2.0版本开始缺省为zkclient实现，以提升zookeeper客户端的健状性；从2.3.0版本开始支持可选curator实现。
	
	应用 dubbo_provider_demo 为服务提供者应用；
	应用 dubbo_consumer_demo 为服务消费者应用；

参考资料：
	dubbo官方文档：
	框架首页：http://dubbo.io/
	用户指南：http://dubbo.io/Developer+Guide-zh.htm
	zookeeper安装官方参考手册：http://dubbo.io/Administrator+Guide.htm#AdministratorGuide-ZookeeperRegistryInstallation

dubbo示例环境搭建及示例运行流程步骤：
一、zookeeper注册中心安装：
		
	1. 下载zookeeper注册中心：
		下载地址：http://www.apache.org/dyn/closer.cgi/zookeeper/, 下载后解压;
		
	2. 修改配置部署zookeeper：
		进入解压目录D:\Program_Files\zookeeper-3.4.6\conf，将 zoo_sample.cfg 拷贝一份更名为 zoo.cfg，
		修改配置 dataDir为 dataDir=D:\\Program_Files\\zookeeper-3.4.6\\mydata （注意：mydata为自行创建的目录）
	
	3. 启动zookeeper注册中心：
		进入D:\Program_Files\zookeeper-3.4.6\bin，双击 zkServer.cmd 启动注册中心服务。
	
	4.验证zookeeper服务：
		通过telnet方式验证zookeeper服务启动是否正常：
		telnet 127.0.0.1 2181
		dump
	
二、启动服务提供者暴露服务接口提供服务
	1. 运行服务提供者应用 dubbo_provider_demo 中的类：src/main/java/com/lx/dubbo/demo/provider/Provider.java

三、启动服务消费者调用远程服务
	1. 运行服务提消费者应用 dubbo_provider_demo 中的类：src/main/java/com/lx/dubbo/demo/consumer/Consumer.java
	