package com.synechron.basics.array;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	
	private String empId;
	private String empFirstName;
	private String empLastName;
	private String empAddress;
	private float empSalary;
	private String empContactNumber;
	
	
	
	
	// private : will not allow anyone to access the field/method outside the
	// class
	// public : we can access it anywhere
	
	// via public methods. ==> anywhere.  
	// setter method : public void setXXX(DT xXX)
	// public : access specifier
	// setXXX : name of the setter method XXX is name of the field
	// DT : data type
	// xXX : name of the field.
	// getter method : public RT getXXX()
	// public : 
	// RT : return type(on the basis of type of your field)
	// getXXX : name of the mehtod
	
	

}
