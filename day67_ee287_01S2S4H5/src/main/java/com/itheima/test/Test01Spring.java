package com.itheima.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.service.ICustomerService;

/**
 * 测试spring的ioc环境是否可用
 * @author 86131
 *
 */
public class Test01Spring {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		ICustomerService cs=(ICustomerService) ac.getBean("customerService");
		cs.findAllCustomer();
	}

}
