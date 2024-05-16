package com.Practise.beans;

public class Employee {
	private Integer eId;
	private String eName;
	private Integer eSalary;
	private Department dept;
	
	
	public void setDept(Department dept) {
		this.dept = dept;
	}

	
	public Employee(Integer eId, String eName, Integer eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", dept=" + dept+ "]";
	}



	
	
	
	
	
}
