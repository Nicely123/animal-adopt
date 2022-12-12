package com.annsl.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;  //数据库的驱动
    @Value("${jdbc.url}")
    private String url;     //连接数据库的url
    @Value("${jdbc.username}")
    private String username;    //数据库的用户名
    @Value("${jdbc.password}")
    private String password;    //数据库的密码
    @Value("${jdbc.maxPoolSize}")
    private int maxPoolSize;       //数据库的最大连接数
    @Value("${jdbc.initialSize}")
    private int initialSize;   //连接池的初始化数量

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolSize);
        dataSource.setInitialSize(initialSize);
        dataSource.setLoginTimeout(3000);   //数据库最大连接实践
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager ds = new DataSourceTransactionManager();
        ds.setDataSource(dataSource);
        return ds;
    }
}
