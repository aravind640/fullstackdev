package com.training.operators;

public class ControlStatementsDemo {
	public static void main(String[] args) {
		int a = 0;
		if (a == 0) {
			System.out.println("Given number is neither Odd nor Even");
		} else if (a % 2 == 0) {
			System.out.println("Given number is an Even number");
		} else {
			System.out.println("Given number is an Odd number");
		}

		System.out.println("Using conditional operator");
		String result = a == 0 ? "Given number is neither Odd nor Even"
				: a % 2 == 0 ? "Given number is an Even number" : "Given number is an Odd number";
		System.out.println(result);
		System.out.println("Using switch case statements");
		int choice = a % 2;
		switch (choice) {
		case 0:
			if (a == 0) {
				System.out.println("Given number is neither Odd nor Even");
			} else {
				System.out.println("Given number is an Even number");
			}
			break;
		case 1:
			System.out.println("Given number is an Odd number");
			break;
		default:
			System.out.println("Given number is neither Odd nor Even");
			break;
		}

		int[] arr = { 12, 10, 5, 8 };

		int len = arr.length; // total count of elements in an array 4 - length is a property (where as for
								// String its length() method)
		int i = 0;
		// 0(T), 1(T), 2(T), 3(T), 4(F)
		System.out.println("Using while loop");
		while (i < len) {
			System.out.println(arr[i]);
			if (arr[i] == 0) {
				System.out.println("Given number is neither Odd nor Even");
			} else if (arr[i] % 2 == 0) {
				System.out.println("Given number is an Even number");
			} else {
				System.out.println("Given number is an Odd number");
			}
			i++;
		}

		System.out.println("Using for loop");
		for (int j = 0; j < len; j++) {
			System.out.println(arr[j]);
			if (arr[j] == 0) {
				System.out.println("Given number is neither Odd nor Even");
			} else if (arr[j] % 2 == 0) {
				System.out.println("Given number is an Even number");
			} else {
				System.out.println("Given number is an Odd number");
			}
		}

		System.out.println("Using for each loop");
		for (int t : arr) {
			System.out.println(t);
			if (t == 0) {
				System.out.println("Given number is neither Odd nor Even");
			} else if (t % 2 == 0) {
				System.out.println("Given number is an Even number");
			} else {
				System.out.println("Given number is an Odd number");
			}
		}

		System.out.println("Using do while loop");
		int k = 0;
		do {
			System.out.println(arr[k]);
			if (arr[k] == 0) {
				System.out.println("Given number is neither Odd nor Even");
			} else if (arr[k] % 2 == 0) {
				System.out.println("Given number is an Even number");
			} else {
				System.out.println("Given number is an Odd number");
			}
			k++;
		} while (k < len);
	}
}
