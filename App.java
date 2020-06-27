package org.techm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.techm.controller.EmployeeController;
import org.techm.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
    	EmployeeController employeeController=(EmployeeController)applicationContext.getBean("ec");
    	employeeController.get();
       // System.out.println( "Hello World!" );
    }
}
