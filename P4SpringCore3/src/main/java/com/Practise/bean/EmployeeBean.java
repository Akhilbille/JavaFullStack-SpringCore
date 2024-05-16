package com.Practise.bean;


public class EmployeeBean {
	
	private Integer id;
	
	private String name;
	
	private Double salary;
	
	private String address;
	
	static {
		System.out.println("Employee class loaded successfully...");
	}
	
//	public EmployeeBean() {
//		System.out.println("Employee Bean constructor loaded.");
//	}
	
	public EmployeeBean(Integer id, String name, Double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	

}
