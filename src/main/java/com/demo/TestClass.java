package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass 
{

	public static void main(String[] args) 
	{
		
		//Customer customer1 = new Customer(202, "Rajesh", 9070707190l);
		//System.out.println(customer1.toString());
		
		System.out.println("===================================Customer==================================================");
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		Customer customer = (Customer) context.getBean("customer");
		
		System.out.println(customer.toString());
		
		System.out.println("===================================Address==================================================");
		
		Address address = (Address) context.getBean("address");
		
		System.out.println(address.toString());
		
	}

}
