import java.util.Scanner;
class Float{
	public static void main(String[] args){
		
		System.out.println("Multiplication of two floating numbers: ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first  floating number: ");
		float a = sc.nextfloat();
		System.out.println("Enter second floating number: ");
		float b = sc.nextfloat();
		float multi = a * b;
		System.out.println("The Multiplication of these floating numbers is: ");
        System.out.println(multi);
	}
}
