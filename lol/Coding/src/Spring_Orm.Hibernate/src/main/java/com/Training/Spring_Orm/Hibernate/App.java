package com.Training.Spring_Orm.Hibernate;

/**
 * Hello world!
 *
 */


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Training.Spring_Orm.Hibernate.dao.EmployeeDao;
import com.Training.Spring_Orm.Hibernate.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
          EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
          
          Employee newEmployee = new Employee();
         
          newEmployee.setId(3);
          newEmployee.setName("Sam");
          newEmployee.setEmail("sam@gmail.com");
          
          int result =  dao.addEmployee(newEmployee);
          System.out.println("("+result+") rows inserted...");
          		
    }
}