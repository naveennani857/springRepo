package com.ultron.springHelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){ /*Create custom methods in record*/};
record Address(String street, int pincode){};

@Configuration   //Indicates that the class contain bean definitions
public class HelloWorldConfiguration {

    @Bean //annotation to mark a method as a bean
    public String name(){
        return "Naveen";
    }

    @Bean
    public int age() { return 27; }

    @Bean(name = "person") //we can use attribute name to get the change the name of the bean
    public Person person() {
        return new Person("Ultron",12, new Address("Chandhanagar" , 500051));
    }

    @Bean
    @Primary  //Used to mark the bean as primary for the Address.
    public Address address() {
        return new Address("Lingampally",500050);
    }

    @Bean
    @Qualifier("Address2")    // It helps Spring identify which specific bean should be injected into a dependent component.
    public Address address2() {
        return new Address("RailwayStation",500050);
    }

    //we can call other beans to create a new bean by using the method call
    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }

    //we can call other beans to create a new bean by using the Paraters call
    @Bean
    public Person person3Parameters(String name, int age, Address address, String state){
        //Person accepts 3 arguments so you cannot pass this,
        //But u can use this if you want
        state = "Telangana";
        return new Person("King",age,address);
    }

    @Bean
    public Person person4Qualifier(String name, int age, @Qualifier("Address2")Address address, String state){
        //Person accepts 3 arguments so you cannot pass this,
        //But u can use this if you want
        state = "Telangana";
        return new Person("King",age,address);
    }

}
