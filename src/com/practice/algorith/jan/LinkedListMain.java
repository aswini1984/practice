package com.practice.algorith.jan;

public class LinkedListMain {

	public static void main(String[] args) {

		Employee ram = new Employee("Ram", "Behera", 12);
		Employee ramesh = new Employee("Ramesh", "Panda", 18);
		Employee paresh = new Employee("Paresh", "Mishra", 20);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(ram);
		list.addToFront(ramesh);
		list.addToFront(paresh);
		
		
		list.printList();
		
		list.removeFromFront();
		
		list.printList();
	}

}
