import java.util.Scanner;
class Sum_of_digits {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string: ");
		long n = in.nextLong();
		System.out.println("The sum of digits is: " + sumDigits(n));
		
	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while (n !=0) {
			sum += n %10;
		}
		return sum;
	}
}