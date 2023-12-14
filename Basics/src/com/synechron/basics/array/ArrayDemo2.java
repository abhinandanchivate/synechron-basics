package com.synechron.basics.array;

import java.util.Iterator;

public class ArrayDemo2 {
	
	// binary search . 
	// what is DS?
	// why we should use it?
	//

	// you need to write a code to search an element / value in an array.
	// input : array 
	// criteria :if  value==a[i]
	// o/p : present or not.
	// 5 mins to complete
	
	public static void main(String[] args) {
		String ip ="192.1681.1.1";
		// 0 to 255 each ip address cell has a range of 0 to 255
		// based on the value from 1st cell we need to return the 
		// class of ip.
		
		String s[] =ip.split("\\."); //\\ \.==> \\.==> \. ==> .
		
	
		for (String value : s) {
			// check each cell should have the value in between 0 to 255
		int	cellValue= Integer.parseInt(value);
		// it will transform our string to int value.
		
		if(cellValue>=0 && cellValue<=255) {
			System.out.println(value);
		}
		else {
			System.out.println("ip is not valid");
			System.exit(1);
		}
			
		}
		// class of ip
		int cellOneValue = Integer.parseInt(s[0]);
		if(cellOneValue>=1 && cellOneValue<=126 ) {
			System.out.println("ip belongs to CLASS A");
		}
		else if(cellOneValue>=128 && cellOneValue<=191) {
			System.out.println("ip belongs to CLASS B");			
		}
		else if(cellOneValue>=192 && cellOneValue<=223) {
			System.out.println("ip belongs to CLASS C");			
		}
		else if(cellOneValue>=224 && cellOneValue<=239) {
			System.out.println("ip belongs to CLASS D");			
		}
		else if(cellOneValue>=240 && cellOneValue<=254) {
			System.out.println("ip belongs to CLASS E");			
		}
		else {
			System.out.println("not in the available range");
		}
		
		
	}
}
