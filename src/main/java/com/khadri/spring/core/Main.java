package com.khadri.spring.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student std = context.getBean("std", Student.class);
        System.out.println(std);
        System.out.println(std.getAddress().getTown());
    }
}