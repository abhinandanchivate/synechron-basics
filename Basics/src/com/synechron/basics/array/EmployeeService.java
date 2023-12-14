package com.synechron.basics.array;

import java.util.Arrays;

public class EmployeeService {
	
	private Employee employees[] = new Employee[10]; // to create self growable array.
	
	private static int count = -1;
	// only 1 & centralized copy.

	public String addEmployee(Employee employee) {
		
		// 1. if array is full then it should increase the size 
		// automatically
		// 2. it should not allow a null employee details.
		
		if(employee!=null) {
			count++;
			
			if(count<employees.length) {
				// allow to add it
				// count  = count + 1
				// count = -1 + 1 
				// count = 0 
				// array index begins with 0.
				
				employees[count] = employee;
				return "success";
			}
			else {
				System.out.println("size increased");
				// we should increase the size of the array.
				Employee temp[] = new Employee[employees.length*2];
				
				// do we need to copy the content from employees to new array(temp)?
				// employees==> temp ===> can i write the for loop? Yes
				// but we will use some predefined methods from the java.
				//System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
				// Object src : source array
				// int srcPos : start location from source to  do the copy work
				// Object dest : dest array (where we want to copy the content)
				// int destPost : start pos for destination array
				// int length : no of elements to be copied from src to dest)
				
				System.arraycopy(employees, 0, temp, 0, employees.length);
				// Arrays.copy
				// about when to prefer to arraycopy and copyof method.
				
				employees= temp;
				employees[count] = employee;
				return "success";
			}
			
		}
		else {
			return " not valid entry";
		}
		
		
		
	}
	
	// to delete the elment from the array
	// public String deleteEmployeeById(String id)
	// 
	
	public String deleteEmployeeById(String id) {
		// NO : 
		// null to the index (deleted index)===> simulation ===> we are setting it to null.
		
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getEmpId().equals(id)) {
				// equals method : String 
				// we should not use == for checking the equality. primitive data types(8 data types).
				
				employees[i] =null;
				return "success";
				
			}
		}
		
		return "fail";
		
		
	}
	//
	
	public Employee getEmployeeById(String id) {
		
		for (Employee employee : employees) {
			// employee may hold null 
			if(employee!=null && employee.getEmpId().equals(id))
				// id.equal
				return employee;
		}
		return null;
	}
	
	// return all employees 
	
	public Employee[]	getAllEmployees() {
		return employees;
	}
	
	// return all employees on the basis of name
	// John
	
	public Employee[] getEmployeesByName(String name) {
		
		Employee[] temp= new Employee[employees.length];
		int counter = -1;
		
		for (int i = 0; i < employees.length; i++) {
			
			if(employees[i]!=null && name.equals(employees[i].getEmpFirstName())) {
				// we need to add that employee into array.
				temp[++counter] = employees[i];
			}
			
		}
		return temp;
		
	}
	
	// can u write the logic for below method?
	
	// update : public String updateEmployeeById(String id , Employee employee)
}








