package com.lee.service;

public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {
		System.out.println("����CXF�ķ����sayHello�����������ˣ�");
		return "hello" + name;
	}

}
