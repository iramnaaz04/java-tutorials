import java.util.Scanner;
public class Table {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=10; i++){
			System.out.println(n + "x" + i + " = " + (n * i));
		}
		
	}
}