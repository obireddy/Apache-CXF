package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.services.CustomerService;
import com.obi.student.dao.StudentService;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context = 
			new ClassPathXmlApplicationContext(new String[] {"Spring-AutoScan.xml"});

		ApplicationContext contxt = new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});

		System.out.println("Application context Id" + contxt.getId());
		System.out.println("Application display name" + contxt.getDisplayName().toString());
		
		StudentService student = (StudentService)contxt.getBean("studentService");
		System.out.println(student);

		CustomerService cus = (CustomerService) context.getBean("customerService");
		System.out.println(cus);

		System.out.println(context.containsBean("customerService"));
	}
}
