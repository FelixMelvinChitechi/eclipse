package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call all methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call the method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();

	}

}
