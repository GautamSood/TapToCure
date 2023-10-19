package com.springcore.springbasics.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springbasics.collection.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springbasics/referencetype/config.xml");
        Parent p1= context.getBean("pref1",Parent.class);
        System.out.println(p1);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getObj());
        System.out.println(p1.getObj().getFirstName());
        
        Parent p2= context.getBean("pref2",Parent.class);
        System.out.println(p2);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getObj());
        System.out.println(p2.getObj().getFirstName());
        
        Parent p3= context.getBean("pref3",Parent.class);
        System.out.println(p3);
        System.out.println(p3.getName());
        System.out.println(p3.getAge());
        System.out.println(p3.getObj());
        System.out.println(p3.getObj().getFirstName());
       
    }
}
