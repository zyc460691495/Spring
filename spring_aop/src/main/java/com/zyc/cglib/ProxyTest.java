package com.zyc.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyTest {

    public static void main(String[] args) {

        final Target target=new Target();

        Increase increase=new Increase();

        //创建增强器
        Enhancer enhancer=new Enhancer();

        //设置父类
        enhancer.setSuperclass(Target.class);

        //设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                increase.before();
                method.invoke(target,args);
                increase.after();
                return null;
            }
        });
        //创建代理对象
        Target target1 = (Target) enhancer.create();
        target1.save();
    }
}
