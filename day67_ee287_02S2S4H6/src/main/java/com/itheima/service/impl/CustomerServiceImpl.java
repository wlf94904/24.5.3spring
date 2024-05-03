package com.itheima.service.impl;
/**
 * 客户的业务层实现类
 */
import java.util.List;

import com.itheima.dao.ICustomerDao;
import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao customerDao;
	
	
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.findAllCustomer();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);

	}

}
