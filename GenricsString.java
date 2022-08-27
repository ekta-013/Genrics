package com.Bridgelabs;

public class GenricsString {
	void value(String a, String b, String c) {
        if ((a.compareTo(b)) >= 0 && (a.compareTo(c)) >= 0)
            System.out.println("maximum: " +a);
        else if ((b.compareTo(c)) >= 0 && (b.compareTo(a)) >=0) {
            System.out.println("Maximum: " +b);
        } else{
            System.out.println("Maximun: " +c);
        }
    }
}
