package com.Bridgelabs;

public class GenricsInt {
	void num(Integer a, Integer b, Integer c){
        if ((a.compareTo(b)) >= 0 && (a.compareTo(c)) >= 0)
            System.out.println("maximum Number: " +a);
        else if ((b.compareTo(c)) >= 0 && (b.compareTo(a)) >=0) {
            System.out.println("Maximum Number: " +b);
        } else{
            System.out.println("Maximun Number: " +c);
        }
    }
}
