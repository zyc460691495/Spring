package com.zyc.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;


//表示该类是Spring的配置文件
@Configuration

//<!--    配置组件扫描-->
//<conext:component-scan base-package="com.zyc"></conext:component-scan>
@ComponentScan("com.zyc")

//<!--    <import resource="classpath:"></import>-->
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {

}
