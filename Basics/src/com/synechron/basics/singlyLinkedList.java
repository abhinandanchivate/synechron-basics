package com.synechron.basics;

import lombok.Data;

@Data
class Node{
	// data , next
	int data;
	Node next; // it will hold hte address of next node/element
	
}

class MyLInkedList{
	private Node head;
	
	public boolean isEmpty() {
		return head==null;
		
	}
	
	// insert method
	
	public void insertFirst(int data) {
		
	}
}
public class singlyLinkedList {
	
	

}
