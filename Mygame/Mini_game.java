import java.util.Scanner;
class Mini_game {
	public static void main(String[] args){
		//MINI PROJECT 
		
		Scanner sc = new Scanner(System.in);
		int myNumber = (int)(Math.random()*100);
		int userNumber = 0;
		
		
		do {
			System.out.println("Guess my number(1-100) : ");
			 userNumber = sc.nextInt();
			
			if(userNumber == myNumber) {
				System.out.println("WOOHOO....CORRECT NUMBER!!");
				break;
			}
			else if(userNumber>myNumber){
				System.out.println("YOUR NUMBER IS TOO LARGE...");
			}
			else{
				System.out.println("YOUR NUMBER IS TOO SMALL...");
			}
		} while(userNumber >= 0);
		System.out.println("My number was: ");
		System.out.println(" ");
		System.out.println(myNumber);
		
		
	}
}