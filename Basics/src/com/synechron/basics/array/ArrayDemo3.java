package com.synechron.basics.array;

public class ArrayDemo3 {
	
	// we need object ==?> 

	public boolean isValuePresent(int value) {

		int a[] = { 10, 20, 24, 12, 200, 1000 };

		for (int i : a) {
			if (i == value) {
				return true;
			}
		}

		return false;

	}
	
	public static void main(String[] args) {
		ArrayDemo3 arrayDemo3 = new ArrayDemo3();
		boolean result = arrayDemo3.isValuePresent(2000);
		
		System.out.println(result);
		
	}

}
