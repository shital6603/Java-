package org.example;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        Parent p1=context.getBean(Parent.class);
        p1.access();
        System.out.println( "Hello World!" );
    }
}
