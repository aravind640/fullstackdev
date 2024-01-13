package com.training.string;

public class StringComparison {
	public static void main(String[] args) {
		String org = "Test";
		
//		System.out.println(org + "Leaf"); //TestLeaf is printed but not pointed or referenced any where
//		org = org + "Leaf";
//		System.out.println(org);
		
		String org1 = new String("Test");
		System.out.println(org == org1);
		System.out.println(org.equals(org1));
		
		String org2 = "Test";
		System.out.println(org == org2);
		System.out.println(org.equals(org2));
		
		// String Functions
		
		System.out.println(org.equals(org2));
		System.out.println(org.length());
		System.out.println(org.toUpperCase());
		System.out.println(org.charAt(1));
		System.out.println(org.indexOf('s'));
		System.out.println(org.indexOf('j'));
		System.out.println(org.concat(" Leaf"));
		System.out.println(org.replace('t', 'D'));
		
		String age = "23";
		int parseAge = Integer.parseInt(age);
		System.out.println(parseAge);
		
		int number = 100;
		String valueNumber = String.valueOf(number);
		System.out.println(valueNumber);
	}
}
