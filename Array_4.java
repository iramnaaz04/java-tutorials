import java.util.Scanner;
public class Array_4{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
			int i ; 
		 int max ;
		int min ;
		int sum=0;
		float avg=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		i = sc.nextInt();
		for(i=0;i<5;i++);
		{
			System.out.printf("%d", arr[i]);
		}
		max = arr[0];
		min = arr[0];
		for(i=0;i<5;i++)
		{
			sum =sum +arr[i];
			avg = sum/5;
		}
		if(arr[i] > max)
		{
			max = arr[i];
		}
			if(arr[i] < min)
			{
				min = arr[i];
			}
			System.out.printf("%d",sum);
			System.out.printf("%f",avg);
			System.out.printf("%d",max);
			System.out.printf("%d",min);
			System.out.println(" ");
			
	}
}
