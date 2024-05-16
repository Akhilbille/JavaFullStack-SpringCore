package com.Practise.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Practise.beans.Department;
import com.Practise.beans.Employee;

public class main {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Employee emp1=  container.getBean("emp1",Employee.class);
		Department dept =  container.getBean("dept1",Department.class);
		System.out.println(emp1);
		System.out.println(dept);

	}

}
