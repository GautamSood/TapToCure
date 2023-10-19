package com.springcore.springbasics;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springbasics/config.xml");
//        Student student1 = (Student) context.getBean("studentobj");
//        System.out.println(student1);
//        Student student2 = (Student) context.getBean("studentobj1");
//        System.out.println(student2);
//        Student student3 = (Student) context.getBean("studentobj2");
//        System.out.println(student3);
        Student student4 = (Student) context.getBean("studentobj3");
        System.out.println(student4);
        Student student5 = (Student) context.getBean("studentobj4");
        System.out.println(student5);
        Student student6 = (Student) context.getBean("studentobj5");
        System.out.println(student6);
    }
}
