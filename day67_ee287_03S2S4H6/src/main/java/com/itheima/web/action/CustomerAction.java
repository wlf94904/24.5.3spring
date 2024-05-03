package com.itheima.web.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
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
@Controller("customerAction")
@ParentPackage("struts-default")
@Namespace("/customer")
@Results({
	@Result(name="addUICustomer",type="dispatcher",location="/jsp/customer/add.jsp"),
	@Result(name="findAllCustomer",type="dispatcher",location="/jsp/customer/list.jsp"),
	@Result(name="listCustomer",type="redirectAction",location="findAllCustomer")
})
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private Customer customer=new Customer();
	private List<Customer> customers;
	@Resource(name="customerService")
	private ICustomerService customerService;

	public CustomerAction() {
		System.out.println(this);
	}

	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	@Action("addCustomer")
	public String addCustomer() {
		customerService.saveCustomer(customer);
		return "listCustomer";
	}
	
	
	/**
	 * 查询所有客户
	 */
	@Action("findAllCustomer")
	public String findAllCustomer() {
//		调用业务层查询客户列表
		customers=customerService.findAllCustomer();
		return "findAllCustomer";
	}
	
	/**
	 * 获取添加客户页面
	 */
	@Action("addUICustomer")
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
