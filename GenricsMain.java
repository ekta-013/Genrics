package com.Bridgelabs;

public class GenricsMain {

	public static void main(String[] args) {
		GenricsInt genInt = new GenricsInt();
		System.out.println("TC1");
		genInt.num(9, 7, 6);
		System.out.println("TC2");
		genInt.num(7, 11, 6);
		System.out.println("TC3");
		genInt.num(7, 6, 13);
	}
}
