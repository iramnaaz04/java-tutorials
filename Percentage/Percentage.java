import java.util.Scanner;
class Percentage {
	public static void main(String[] args) {
     System.out.println("Enter marks of 5 subjects: ");
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter physics marks: ");
	 float a = sc.nextFloat();
	 System.out.println("Enter maths marks: ");
	 float b = sc.nextFloat();
	 System.out.println("Enter english marks: ");
	 float c = sc.nextFloat();
	  System.out.println("Enter chemistry marks: ");
	 float d = sc.nextFloat();
	 System.out.println("Enter algebra marks: ");
	 float e = sc.nextFloat();
	 float sum = a + b + c + d + e;
	 System.out.println("Addition of 5 subject is: ");
	 System.out.println(sum);
	 float percentage = (sum/500)*100;
	 System.out.println("Percentage is: ");
     System.out.print(percentage);	 
	}
}
	 
	 