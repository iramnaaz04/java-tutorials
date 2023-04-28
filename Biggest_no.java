import java.util.Scanner;
public class Biggest_no{
	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number");
		x = sc.nextInt();
		System.out.print("Enter second number");
		y = sc.nextInt();
		System.out.print("Enter third number");
		z = sc.nextInt();
		if(x>y && x>z)
		{
			System.out.println("Largest number is:"+x);
		}
		else if(y>z)
		{
			System.out.println("Largest number is:"+y);
		}
		else {
			System.out.println("Largest number is:"+z);
		}
	}
}