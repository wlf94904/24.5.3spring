package com.itheima.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
/**
 * 账户的业务层实现类
 * @author 86131
 *
 */
@Repository("accountDao")
public class AccountDaoImpl1 implements IAccountDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Account findAccountById(Integer accountId) {
		// TODO Auto-generated method stub
		List<Account> list=jdbcTemplate.query("select * from account where id=?",new BeanPropertyRowMapper<Account>(Account.class),accountId);
		return list.isEmpty()?null:list.get(0);
	}

	@Override
	public Account findAccountByName(String name) {
		List<Account> list=jdbcTemplate.query("select * from account where name=?",new BeanPropertyRowMapper<Account>(Account.class),name);
		if(list.isEmpty()) {
			return null;//没有这个名称的账户
		}
		if(list.size()>1) {
//			结果集不唯一，不符合我们的约定
			throw new RuntimeException("结果集不唯一，请检查数据");
		}
		return list.get(0);
	}

	@Override
	public void updateAccount(Account account) {
		jdbcTemplate.update("update account set name=?,money=?where id=?",account.getName(),account.getMoney(),account.getId());

	}

}
