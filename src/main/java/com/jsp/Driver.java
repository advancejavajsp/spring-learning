package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=
                new ClassPathXmlApplicationContext("config.xml");

        Person person=(Person) context.getBean("person");

        System.out.println(person.getName());
        System.out.println(person.getId());

        context.close();
        System.out.println("container closed");


    }
}
