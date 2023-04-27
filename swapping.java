 import java.util.Scanner;
 public class swapping{
	 public static void main(String[] args){
		 int a,b,c;
		// System.out.println("Taking input from user");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter value of a");
		 a = sc.nextInt();
		 System.out.println("Enter value of b");
		 b = sc.nextInt();
		 System.out.println("Before swapping numbers:"+a+" "+b);
		 c = a;
		 a = b;
		 b = c;
		 
		 System.out.println("After swapping "+a+" "+ b);
		 System.out.println();
        
	 }
 }