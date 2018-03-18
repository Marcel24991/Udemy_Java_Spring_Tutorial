package de.marcel.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		final String filename = "beanScope-applicationContext.xml";
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(filename);
		
		// retrieve beans from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean foo = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object " + foo);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		// close context
		context.close();
	}
}
