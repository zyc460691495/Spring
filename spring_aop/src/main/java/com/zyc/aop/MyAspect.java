package com.zyc.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    public void before(){
        System.out.println("beofre......");
    }

    public void afterReturning(){
        System.out.println("后置。。。。。。。");
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前。。。。");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕后。。。。");
        return proceed;
    }

    public void afterThrowing(){
        System.out.println("异常。。。");
    }

    public void after(){
        System.out.println("最终");
    }
}
