import java.util.Scanner;
public class colour {
	public static void main(String[] args){
		
		char ch = 'V';
		
	
			Scanner sc = new Scanner(System.in);
		    System.out.print("Enter your choice");
			ch = sc.next().charAt(0); 
			char a;
			switch(ch)
			{
				case 'R':
				case 'r':System.out.println("Red");
				break;
				
				case'G':
				case 'g':System.out.println("Green");
                break;
                
                case'B':
                case'b':System.out.println("Blue");

                default:System.out.println("Invalid input");				
			}
		System.out.println(ch + "");
	}
} 