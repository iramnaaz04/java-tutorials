import java.util.Scanner;
public class reverse_no{
	public static void main(String[] args){
		int i,rem=0,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		i = sc.nextInt();
		while (i>0)
		{
			rem = i%10;
			rev = (rev * 10)+rem;
			i = i/10;
		}
		System.out.printf("%d",rev);
	}
}