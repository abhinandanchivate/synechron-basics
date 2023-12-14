package com.synechron.basics.array;

public class ArrayCRUDEx {
	//CRUD Ops : 
	// C : create
	// R : read
	// U : update
	// D : delete
	
	// primitive Data types / custom class (user defined class).
	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		
		
		for(int i =1;i<=20;i++) {
			
			String result = employeeService.addEmployee(new Employee("ab00"+i, "abhi", "chivate", "pune", 2000, "9975477764"));
			
			System.out.println(result + i);
		}
		
		Employee employee = employeeService.getEmployeeById("ab005");
		System.out.println(employee);
		String result = employeeService.deleteEmployeeById("ab005");
		System.out.println(result);
		Employee employee2 = employeeService.getEmployeeById("ab005");
		System.out.println("after delete"+employee2);
		
		for (Employee emp : employeeService.getAllEmployees()) {
			System.out.println(emp);
		}
		
		Employee[] empls = employeeService.getEmployeesByName("abhi");
		
		System.out.println("list on the basis of name: ");
		for (Employee employee3 : empls) {
			System.out.println(employee3);
		}
		
		
	}

}
