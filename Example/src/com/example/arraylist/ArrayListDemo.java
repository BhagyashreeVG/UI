package com.example.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(101, "John", 100000D);
		Employee e2 = new Employee(102, "Smith", 7000D);
		Employee e3 = new Employee(103, "Waren", 500000D);
		Employee e4 = new Employee(104, "Cook", 60000D);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		
		System.out.println("For loop");
		for (int i=0; i<employees.size(); i++) {
			System.out.println(employees.get(i));
		}
		
		System.out.println("For each");
		employees.forEach(emp-> System.out.println(emp));
		
		System.out.println("Using map for showing name in uppercase");
		employees.stream().map(emp-> emp.employeename.toUpperCase()).forEach(emp-> System.out.println(emp));
		
		System.out.println("Using stream");
		employees.stream().forEach(emp-> System.out.println(emp));
		
		System.out.println("Sort employees");
		Collections.sort(employees);
		employees.forEach(emp-> System.out.println(emp));
		
		System.out.println("List iterator in forward direction");
		ListIterator<Employee> itr = employees.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("List iterator in reverse direction");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println("Average salary");		
		System.out.println(employees.stream().mapToDouble(emp-> emp.getEmployeeSalary()).average().getAsDouble());
		
		System.out.println("Sort using stream");
		employees.stream().sorted().forEach(emp-> System.out.println(emp));
	}
}
