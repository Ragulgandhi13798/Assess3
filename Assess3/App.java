package com.springcoreeg.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcoreeg/lifecycle/configu.xml");
      Coffee c = (Coffee) context.getBean("co");
      Tea t = (Tea) context.getBean("tea");
      
      context.registerShutdownHook();
      
      System.out.println(t);
     
      System.out.println(c);
    }
}
