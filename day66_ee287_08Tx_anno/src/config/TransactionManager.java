package config;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * 事务控制的配置类
 * @author 86131
 *
 */
public class TransactionManager {

	@Bean(name="transactinoManager")
	public PlatformTransactionManager createTransactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}
