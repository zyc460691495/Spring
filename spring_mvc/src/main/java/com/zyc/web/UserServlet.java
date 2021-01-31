package com.zyc.web;

import com.zyc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UserServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        req.getServletContext();
        ServletContext servletContext = this.getServletContext();
//        ������ȡ��
//        ApplicationContext applicationContext = (ApplicationContext) servletContext.getAttribute("applicationContext");

//        ʹ�ù�����ȡ��
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();

    }
}
