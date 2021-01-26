package com.zyc.service.impl;

import com.zyc.dao.UserDao;
import com.zyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//<bean id="userService" class="com.zyc.service.impl.UserServiceImpl">
//</bean>
//@Component("userService")
@Service("userService")
//@Scope("prototype")
@Scope("singleton")
public class UserServiceImpl implements UserService {

//    <property name="userDao" ref="userDao"></property>
//    @Autowired
//    @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    @Value("${jdbc.driver}")
    private String string;


    @Override
    public void save() {
        System.out.println(string);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("service对象创建");
    }

    @PreDestroy
    public void destory(){
        System.out.println("service对象销毁");
    }
}
