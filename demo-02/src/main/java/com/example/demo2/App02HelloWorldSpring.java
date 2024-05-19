package com.example.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // Creating an application context using the configuration class
        var context = new AnnotationConfigApplicationContext(HelloworldConfig.class);

        // Retrieving and printing beans from the context
        // Printing the 'name' bean
        System.out.println(context.getBean("name"));
        // Printing the 'age' bean
        System.out.println(context.getBean("age"));
        // Printing the 'person' bean
        System.out.println(context.getBean("person"));
        // Printing the 'yourAddress' bean
        System.out.println(context.getBean("yourAddress"));
        // Uncomment the line below to retrieve an Address bean by its class
        // System.out.println(context.getBean(Address.class));
        // Printing the 'person2MethodCall' bean
        System.out.println(context.getBean("person2MethodCall"));
        // Printing the 'person3Parameter' bean
        System.out.println(context.getBean("person3Parameter"));
    }
}
