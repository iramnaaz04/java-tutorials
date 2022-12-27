class Practice_set2 {
	public static void main(String[] args) {
		//Write a java program to print ****
									//	***
									//  **
									//  *
				int n = 4;
				for(int i=n; i>0; i--){
					for(int j=0;j<i;j++){
						System.out.print("*");
					}
					System.out.print("\n");
				}
				
				
			//Write a program to sum first n even numbers using while loop  .....here n = u
			int sum=0;
			int u=3;
			for(int i=0;i<u;i++){
				sum = sum +(2*i);
			}
			System.out.print("Sum of even numbers is: ");
			System.out.println(sum);
			
			
			
			//Write a program to print multiplication table of a given number b
			 int b = 5;
			 for(int k=0;i<=10;k++); {
				 System.out.printf("%d X %d = %d/n" , b, k, b*k);
			 }
	} 
}
