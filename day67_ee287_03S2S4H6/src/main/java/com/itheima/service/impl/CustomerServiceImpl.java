package com.itheima.service.impl;
/**
 * 客户的业务层实现类
 */
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.ICustomerDao;
import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;
@Service("customerService")
@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
public class CustomerServiceImpl implements ICustomerService {

	@Resource(name="customerDao")
	private ICustomerDao customerDao;
	

	@Override
	@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.findAllCustomer();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);

	}

}
