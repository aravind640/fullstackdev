package com.training.primitivetypes;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 10;
		short s = 151;
		System.out.println(b);
		System.out.println(s);
		s = b; // implicit type conversion
		System.out.println(s);
		b = (byte) s;
		System.out.println(b);
	}
}
