package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotype-config.xml");
        Employee employee = context.getBean("employeeObject", Employee.class);
        System.out.println(employee);
        System.out.println(employee.getPhoneNumbers());
        System.out.println(employee.getPhoneNumbers().getClass().getName());
       
    }
}
