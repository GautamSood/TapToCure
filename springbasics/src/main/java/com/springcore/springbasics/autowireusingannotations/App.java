package com.springcore.springbasics.autowireusingannotations;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springbasics/autowireusingannotations/config.xml");
        Employees e4=(Employees) context.getBean("emp4");
        System.out.println(e4);


    }
}
