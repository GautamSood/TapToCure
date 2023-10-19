package com.springcore.springbasics.autowireusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springbasics/autowireusingxml/config.xml");
//        Employees e1=(Employees) context.getBean("emp1");
//        System.out.println(e1);
//        
//        Employees e2=(Employees) context.getBean("emp2");
//        System.out.println(e2);
//
//        Employees e3=(Employees) context.getBean("emp3");
//        System.out.println(e3);
        

        Employees e4=(Employees) context.getBean("emp4");
        System.out.println(e4);


    }
}
