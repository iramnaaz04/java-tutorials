import java.util.Scanner;
class Average {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Input second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Input third number: ");
		int num3 = sc.nextInt();
		
		System.out.println("Input fourth number: ");
		int num4 = sc.nextInt();
		
		System.out.println("Input fifth number: ");
		int num5 = sc.nextInt();
		
		System.out.println("Average of 5 numbers is: " + (num1 + num1 + num3 + num4 + num5)/5);
	}
}