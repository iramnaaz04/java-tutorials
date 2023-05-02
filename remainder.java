import java.util.Scanner;
public class remainder{
	public static void main(String[] args){
		int n,i=0,sum=0,rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		n = sc.nextInt();
		while(i>0)
		{
			rem = i%10;
			sum = sum+rem;
			i = i%10;
			break;
		}
		System.out.printf(" ",sum);
	}
}