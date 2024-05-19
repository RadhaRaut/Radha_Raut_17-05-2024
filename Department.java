package com.JavaInheritance;

public class Department {
	private int departmentId;
	private String departmentName;
	
	public Department()
	{
		
	}

	public Department(int departementId, String departementName) {
		this.departmentId = departementId;
		this.departmentName = departementName;
	}
	
	
	
	public void setDepartementId(int departementId) {
		this.departmentId = departementId;
	}

	public void setDepartementName(String departementName) {
		this.departmentName = departementName;
	}

	public void getDepartmentDetails()
	{
		System.out.println(this.departmentId);
		System.out.println(this.departmentName);
	}

}
