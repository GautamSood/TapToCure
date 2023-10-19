package com.springcore.springbasics.standalonecollection;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springbasics/standalonecollection/configs.xml");
        Person p1= context.getBean("person1",Person.class);
        Person p2= context.getBean("person2",Person.class);
        System.out.println(p1.getCourse());
        System.out.println(p1.getCourses());
        System.out.println(p1.getCourse().getClass().getName());
        System.out.println(p2.getCourse());
        System.out.println(p2.getCourses());
        System.out.println(p2.getCourses().getClass().getName());
       
    }
}
