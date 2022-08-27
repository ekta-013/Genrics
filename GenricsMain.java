package com.Bridgelabs;

public class GenricsMain {

	public static void main(String[] args) {
		GenricsFloat genFloat = new GenricsFloat();
		System.out.println("TC1");
		genFloat.num(9F, 7F, 6.5F);
		System.out.println("TC2");
		genFloat.num(7F, 11.5F, 6F);
		System.out.println("TC3");
		genFloat.num(7F, 6F, 13F);
	}
}
