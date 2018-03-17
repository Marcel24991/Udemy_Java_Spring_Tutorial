package de.marcel.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
	    String filename = "applicationContext.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(filename);
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
