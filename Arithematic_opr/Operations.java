import java.util.Scanner;
class Operations{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of two numbers: " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("Subtraction of two numbers: " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("Multiplication of two numbers: " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("Division of two numbers: " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println("Remainder of two numbers: " + num1 + " mod " + num2 +" = " + (num1 % num2));
		
	}
}