import java.util.Scanner;
class Reverse_string{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a string: ");
		char[] letters = sc.nextLine().toCharArray();
		System.out.print("Reverse string: ");
		for (int i = letters.length -1; i>=0; i--){
			System.out.print(letters[i]);
		}
		System.out.print("\n");
	}
}