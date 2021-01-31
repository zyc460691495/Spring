package com.zyc.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext servletContext = sce.getServletContext();

        //��ȡweb.xml�е�ȫ�ֲ���
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(contextConfigLocation);

        //��Spring��Ӧ�������Ķ���洢��ServletContext����
        servletContext.setAttribute("applicationContext",applicationContext);
        System.out.println("spring����������ϡ���������");
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
