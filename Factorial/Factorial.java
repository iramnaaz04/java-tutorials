import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.printf("Enter two numbers: ");
		int num = sc.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial of entered number is: " + factorial);
		
	}
	
	static int fact(int n)
	{
		int output;
		if(n==1){
			return 1 ;
		}
		output = fact(n-1)*n;
		return output;
	}
}