package com.Bridgelabs;

public class GenricsMain {

	public static void main(String[] args) {
		GenricsString genString = new GenricsString();
		System.out.println("TC1");
		genString.value("Strawberry", "Banana", "Apple");
		System.out.println("TC2");
		genString.value("Apple", "strawberry", "Peach");
		System.out.println("TC3");
		genString.value("Banana", "Apple", "Strawberry");
	}
}
