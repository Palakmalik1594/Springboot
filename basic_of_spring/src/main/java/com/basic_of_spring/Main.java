package com.basic_of_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ioc=new ClassPathXmlApplicationContext("config.xml");
		Person person=ioc.getBean("person",Person.class);
		System.out.println(person);
		person.message();
		
		Employee e=ioc.getBean("employee",Employee.class);
		System.out.println(e);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		// we can also pass default values by ourself in config.xml otherwise they are provided by jvm
		//while setting the values ,by default it should be set+name of var otherwise error will come
	}
	

}
