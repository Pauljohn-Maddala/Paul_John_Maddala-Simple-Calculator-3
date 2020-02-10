package com.epam.app;

public class opt {
	public static double add(double a,double b) {
		return a+b;
	}
	
	public static double sub(double a,double b) {
		return a-b;
	}
	
	public static double mul(double a,double b) {
		return a*b;
	}
	
	public static double div(double a,double b) {
		try {
			return a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			return -1;
		}
	}
	
	public static double md(double a,double b) {
		return a%b;
	}
	
}
