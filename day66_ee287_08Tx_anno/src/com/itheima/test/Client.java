package com.itheima.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

import config.SpringConfiguration;

/**
 * 测试类
 * @author 86131
 *
 */
public class Client {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		IAccountService accountService=(IAccountService)ac.getBean("accountService");
//		Account account=accountServie.findAccountById(1);
//		System.out.println(account);
		accountService.transfer("aaa", "bbb", 100f);
		
	}

}
