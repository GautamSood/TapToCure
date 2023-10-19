package com.springcore.springbasics.stereotypeannotations;


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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springbasics/stereotypeannotations/configs.xml");
//        Students s1= context.getBean("students",Students.class);
        Students s1= context.getBean("stu",Students.class);
        System.out.println(s1.hashCode());
        System.out.println(s1);
        Students s2= context.getBean("stu",Students.class);
        System.out.println(s2.hashCode());
        System.out.println(s2);
    }
}
