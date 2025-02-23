package com.ultron.springHelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringAppHelloWorld {
    public static void main(String[] args) {
        //1. Launch an application context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            //2. Configure the things that we want to manage
            //HelloWorldConfiguration - annotated with @Configuration, this manages the Beans

            //3. Retrieving the Beans managed by spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));
            System.out.println(context.getBean(Address.class)); //can give the class name also

            System.out.println("person2MethodCall: " + context.getBean("person2MethodCall"));

            System.out.println("person3Parameters: " + context.getBean("person3Parameters"));

            System.out.println("person4Qualifier: " + context.getBean("person4Qualifier"));


            //Finding all the Beans and printing
            System.out.println(context.getBeanDefinitionCount());
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
