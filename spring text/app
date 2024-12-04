package com.codinghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//       student s=context.getBean("student",student.class);
//       System.out.println(s);
//       student s1=context.getBean("student1",student.class);
//       System.out.println(s1); 
       stud1 s=context.getBean(stud1.class);
       System.out.println(s);
       employee e=context.getBean(employee.class);
       System.out.println(e);
       
    }
}
