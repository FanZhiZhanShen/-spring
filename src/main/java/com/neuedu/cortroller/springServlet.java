package com.neuedu.cortroller;


import com.neuedu.entity.JDBC;
import com.neuedu.service.IProductService;
import com.neuedu.service.ProductService;
import com.neuedu.service.adas;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class springServlet  {
    public static void main(String args[])throws Exception {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-config.xml");
        IProductService iProductService=applicationContext.getBean(IProductService.class);
        iProductService.addProduct(1,"张三");

//        JDBC C=(JDBC)object;
//        System.out.println(C);
//        if (object instanceof adas){
//            adas c=(adas)object;
//            System.out.println(c.getName());
//            System.out.println(c.getCartInfo());
//        }
//        Object object1=applicationContext.getBean("sas");
//        System.out.print(object1==object);
    }
 }
