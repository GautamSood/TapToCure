package com.springcore.springbasics.collection;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springbasics/configs.xml");
        Employee e1= context.getBean("employee1",Employee.class);
        System.out.println(e1.getName());
        System.out.println(e1.getPhones());
        System.out.println(e1.getAddresses());
        System.out.println(e1.getCourses());
        System.out.println(e1.getDesignations());
        System.out.println(e1.getPhones().getClass().getName());
       
    }
}
