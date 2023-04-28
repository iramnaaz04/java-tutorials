import java.util.Scanner;
public class Temp_centi {
	public static void main(String[] args) {
		System.out.println("Enter temperature in Centigrade");
		Scanner sc = new Scanner(System.in);
		int c = Integer.parseInt(sc.nextLine());
		float f = ((9f*c)/5f)+32;
		
		System.out.println("Temperature in Fahrenheit is: "+f);
	}
}