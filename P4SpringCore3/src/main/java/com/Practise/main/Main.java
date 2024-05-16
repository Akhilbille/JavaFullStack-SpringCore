package com.Practise.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Practise.bean.EmployeeBean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		 EmployeeBean employeeBean1 = container.getBean("emp1",EmployeeBean.class);
		 EmployeeBean employeeBean2 = container.getBean("emp2",EmployeeBean.class);
		 System.out.println(employeeBean1);
		 System.out.println(employeeBean2);
		 
		 
	}

}
