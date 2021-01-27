package com.zyc.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
//表示该类是一个切面类
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.zyc.anno.*.*(..))")
    public void myPointcut(){}


//    配置前置
//    @Before("execution(* com.zyc.anno.*.*(..))")
    @Before("myPointcut()")
//    @Before("MyAspect.myPointcut()")
    public void before(){
        System.out.println("beofre......");
    }


    public void afterReturning(){
        System.out.println("后置。。。。。。。");
    }

    @Around("execution(* com.zyc.anno.*.*(..))")
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
