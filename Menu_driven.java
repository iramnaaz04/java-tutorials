import java.util.Scanner;
public class Menu_driven{
	public static void main(String[] args){
		int a,b,ch,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a and b");
		ch = sc.next().charAt(0);
		System.out.println("Enter 1 for addition: ");
			System.out.println("Enter 2 for subtraction: ");
				System.out.println("Enter 3 for multiplication: ");
					System.out.println("Enter 1 for division: ");
					switch(ch)
					{
						case 1: c = a+b;
						System.out.print("addition of two numbers is ",c);
						break;
						
						case 2: c = a-b;
						System.out.print("subtraction of two numbers is ",c);
						break;
						
						case 3: c = a*b;
						System.out.print("multiplication of two numbers is ",c);
						break;
						
						case 4:c = a/b;
						System.out.print("division of two numbers is ",c);
						break;
						
						default: System.out.println("Invalid input....!!!!!");
						
					}
			System.out.println(ch + " ");
	}
}
