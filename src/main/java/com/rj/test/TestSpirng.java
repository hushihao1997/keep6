package com.rj.test;

import com.rj.service.Impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpirng {

    @Test
    public void run01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl imp = (UserServiceImpl) context.getBean("userServiceImpl");
        imp.findAll();
    }
}
