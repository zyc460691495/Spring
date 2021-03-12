package com.zyc.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyTest {

    public static void main(String[] args) {

        final Target target=new Target();

        Increase increase=new Increase();

        //������ǿ��
        Enhancer enhancer=new Enhancer();

        //���ø���
        enhancer.setSuperclass(Target.class);

        //���ûص�
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                increase.before();
                method.invoke(target,args);
                increase.after();
                return null;
            }
        });
        //�����������
        Target target1 = (Target) enhancer.create();
        target1.save();
    }
}
