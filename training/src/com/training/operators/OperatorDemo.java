package com.training.operators;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10;
		a = a + 10;
		a += 20; // a = a + 20 short hand way of operator
		int b = 20;
		int c = a + b;
		// a,b are operands
		// + is the operator
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(--a);
		
		boolean bool = true;
		System.out.println(!bool);
		
		System.out.println(10%5);
		System.out.println(10/5);
		
		System.out.println(2 << 2); // left shift operator moves by bit - bit manipulation
		System.out.println(2 >> 2); // right shift operator moves by bit - bit manipulation
		
		
		
	}
}
