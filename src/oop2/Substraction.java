package oop2;

import oop1.Addition;

public class Substraction extends Addition{
	
	int sub(int a, int b) {
		int s = a-b;
		return s;
	}
	
	double sub(double a, double b) {
		double s= a-b;
		return s;
	}

	public static void main(String[] args) {
		
		Substraction s1 = new Substraction();
		s1.sub(6, 2);
		System.out.println(s1.sub(6, 2));
		
		double x= s1.sub(7.9, 2.1);
		System.out.println(x);
		s1.add(2, 3);
		s1.add(2, 5, 9);					
	}
}
