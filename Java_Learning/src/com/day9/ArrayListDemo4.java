package com.day9;

import java.util.ArrayList;

import com.day6.Emp;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(100, "uma", "uma@gmail.com");
		Employee emp2 = new Employee(200, "Sree", "sree@gamil.com");
		Employee emp3 = new Employee(30, "ratan", "ratan@gmail.com");
		
		ArrayList<Employee> myEmpList = new ArrayList<>();
		myEmpList.add(emp1);
		myEmpList.add(emp2);
		myEmpList.add(emp3);
		
		
		System.out.println(emp3.name);
		
		System.out.println(myEmpList.get(1).email);
	}
	
	
	

}
