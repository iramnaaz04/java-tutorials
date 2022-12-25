import java.util.Scanner;
class Practice_set {
	 public static void main (String[] args) {
		 byte m1, m2, m3;
	//	 Scanner sc = new Scanner(System.in); 
		 // Question 1
	//	System.out.println("Enter your marks in Physics");
		// m1 = sc.nextByte();
		 //System.out.println("Enter your marks in Chemistry");
		 //m2 = sc.nextByte();
		 //System.out.println("Enter your marks in Mathematics");
		 //m3 = sc.nextByte();
		 //float avg = (m1+m2+m3)/3.0f;
		 //System.out.println("Your Overall Percentage is: " + avg);
		 //if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
			// System.out.println("You are promoted");]
		 //}
		 //else{
			// System.out.println("You are not promoted");
		 //}
		 
		 
		 // Question 4
		Scanner sc = new Scanner(System.in); 
	int day = sc.nextInt();
	switch(day){
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
	}
		 
	 }
}

	