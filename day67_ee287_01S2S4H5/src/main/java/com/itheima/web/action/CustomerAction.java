package com.itheima.web.action;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;
import com.itheima.service.impl.CustomerServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 客户的动作类
 * @author 86131
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private Customer customer=new Customer();
	private List<Customer> customers;
	private ICustomerService customerService;

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}

	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
//	此种方式根本不能用，因为由于动作类是多例的，每次都会创建新的容器，导致容器中的bean也会创建新的
//	public CustomerAction() {
////		System.out.println(customerService);
//		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
//		System.out.println(ac);
//		ICustomerService cs=ac.getBean("customerService");
//		this.setCustomerService(cs);
//	}
	
//	此种方式解决了容器多例的问题，保证了容器一个应用只有一个，但是我们的代码变臃肿了，每个action都需要这么写一下
//	public CustomerAction() {
//		//System.out.println(customerService);
//		ServletContext application=ServletContext.getServletContext();
//		ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(application);
//		System.out.println(ac);
//		ICustomerService cs=ac.getBean("customerService");
//		this.setCustomerService(cs);
//	}
	
	/**
	 * 查询所有客户
	 */
	public String findAllCustomer() {
//		调用业务层查询客户列表
		customers=customerService.findAllCustomer();
		return "findAllCustomer";
	}
	
	/**
	 * 获取添加客户页面
	 */
	public String addUICustomer() {
		return "addUICustomer";
	}

//	getters and setters
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
//	
	
}
