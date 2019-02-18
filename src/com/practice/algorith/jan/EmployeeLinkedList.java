package com.practice.algorith.jan;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		EmployeeNode removed = head;
		head = removed.getNext();
		size--;
		return removed;
	}
	
	public int size() {
		return size;
	}
	
		
	
	public void printList() {
		
		EmployeeNode current = head;
		
		System.out.println("Head ->");
		while(current != null) {
			System.out.print(current);
			System.out.print("->");
			current = current.getNext();
		}
		System.out.print("null");
	}
}
