import java.util.Scanner;
public class Array_addition{
	public static void main(String[] args){
		int arr[];
		arr = new int[5];
		
		int i,n=0,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		i = sc.nextInt();
        System.out.printf("%d", n);
        System.out.println("Enter 5 number's: ");
		i = sc.nextInt();
		for(i=0;i<5;i++)
		{
			System.out.printf("%d", arr[i]);
		}
		for(i=0;i<5;i++)
		{
			p = n * arr[i];
			System.out.printf("\n %d", p);
		}
		System.out.println(" ");
	}
}
