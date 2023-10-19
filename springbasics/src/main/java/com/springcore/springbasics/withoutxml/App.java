package com.springcore.springbasics.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.springbasics.withoutxml.Javaconfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
//        Students s1= context.getBean("stud", Students.class);
//        System.out.println(s1);
        
        Students s1= context.getBean("getStudents", Students.class);
        s1.study();
        System.out.println(s1);
    }
}
