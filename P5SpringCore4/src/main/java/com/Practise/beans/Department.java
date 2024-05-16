package com.Practise.beans;

public class Department {
	private Integer id;
	private String dname;
	
	
//	public Department(int id,String dname) {
//		this.id = id;
//		this.dname = dname;		
//	}
	
	
	

	public void setId(Integer id) {
		this.id = id;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}
	
	

	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + "]";
	}
	
}
