
public class Calculator {
	public static void main(String[] args) {
		System.out.println("Arithmetic Calculator");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition is " + (a + b));
		System.out.println("Subtraction is " + (a - b));
		System.out.println("Multiplication is " + (a * b));
		System.out.println("Division is " + (a/b));
	}
}
