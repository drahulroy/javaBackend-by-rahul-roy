package com.example.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Record class for Person
record Person(String name, int age, Address address) {}
// Record class for Address
record Address(String L1, String L2, String L3) {}

@Configuration
public class HelloworldConfig {
    // Defining a bean for the name
    @Bean
    public String name() {
        return "rahul";
    }

    // Defining a bean for the age
    @Bean
    public int age() {
        return 20;
    }

    // Defining a bean for a Person
    @Bean
    public Person person() {
        return new Person("ram", 12, new Address("main road", "gali 2", "danapur"));
    }

    // Defining the first Address bean with name 'yourAddress'
    @Bean(name = "yourAddress")
    public Address address1() {
        return new Address("SITA", "123 Ray Street", "London");
    }

    // Defining the second Address bean with name 'address2'
    @Bean(name = "address2")
    public Address address2() {
        return new Address("yo yo", "its", "noida BC");
    }

    // Defining a bean for a Person using method calls
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address1());
    }

    // Defining a bean for a Person using parameters
    @Bean
    public Person person3Parameter(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }
}
