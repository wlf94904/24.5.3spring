package com.itheima.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.itheima.dao.ICustomerDao;
import com.itheima.domain.Customer;
/**
 * 客户的持久层实现类
 * @author 86131
 *
 */
public class CustomerDaoImpl implements ICustomerDao {
	
	private HibernateTemplate hibernateTemplate;


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Customer> findAllCustomer() {
		return (List<Customer>) hibernateTemplate.find("from Customer");
				
	}

	@Override
	public void saveCustomer(Customer customer) {
		hibernateTemplate.save(customer);

	}

}
