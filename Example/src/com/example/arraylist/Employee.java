package com.example.arraylist;

public class Employee implements Comparable<Employee> {
	int employeeId;
	String employeename;
	Double employeeSalary;
	
	public Employee(int employeeId, String employeename, Double employeeSalary) {
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.employeeSalary = employeeSalary;
	}
	
	 public String toString() {
		 return "[Employee:" + this.employeeId + " " + this.employeename + " " + this.employeeSalary + "]";
	    }

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.employeename.compareTo(o.employeename);
	}
}
