package com.Practise.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp1 {
	
	public static void main(String[] args) {
		
		//To activate the spring and telling the spring to where to find instructions
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Amazon amz = container.getBean(Amazon.class);
		amz.deliverTheProduct(1236.3);
		
	};

}
