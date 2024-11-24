package oop3;

import oop1.Addition;

public class Division extends Addition {
	
	int divide(int a, int b){
		int div=a/b;
		return div;
	}
	
	int divide(int c, int d, int e){
		int div= c/d;
		return div;
	}
	
	double divide(double a, double b) {
		double div =a/b;
		return div;
	}

	public static void main(String[] args) {
		Division d1=new Division();
		d1.divide(10.90, 2.01);
		System.out.println(d1.divide(10.90, 2.01));
		d1.divide(90, 10);
		int t= d1.divide(90, 10);
		System.out.println(t);
		
		//(10+40)/5
		
		d1.add(10, 40);
		int j =d1.add(10, 40);
		
		d1.divide(d1.add(10, 40), 5);
		d1.divide(j, 5);
		int k =d1.divide(j, 5);
		
		System.out.println(d1.divide(j, 5));
		System.out.println(k);
		
		//(50/10)+20
		d1.divide(50, 10);
		d1.add(d1.divide(50, 10), 20);
		System.out.println(d1.add(d1.divide(50, 10), 20));
		
		
		//(50/10)+20
		int s1= d1.divide(50, 10);
		d1.add(s1, 20);
		int s2=d1.add(s1, 20);
		System.out.println(s2);
		
		
		
		

	}//closing of main method

}//closing of class
