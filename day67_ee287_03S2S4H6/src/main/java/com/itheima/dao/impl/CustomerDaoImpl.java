package com.itheima.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.itheima.dao.ICustomerDao;
import com.itheima.domain.Customer;
/**
 * 客户的持久层实现类
 * @author 86131
 *
 */
@Repository("customerDao")
public class CustomerDaoImpl implements ICustomerDao {
	
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;



	@Override
	public List<Customer> findAllCustomer() {
		return (List<Customer>) hibernateTemplate.find("from Customer");
				
	}

	@Override
	public void saveCustomer(Customer customer) {
		hibernateTemplate.save(customer);

	}

}
