public class Strings{
	public static void main(String[] args){
		/*
		//Declaration of a String:
		String name = "Tony";
		//String fullname = "Tony Stark";
		String sentence = "My name is Tony Stark.";
		//concatenation
		String firstname = "Tony";
		String lastname = "Stark";
		String fullname = firstname + " " + lastname;
		System.out.println(fullname);
		System.out.println(fullname.length());
		
		//charAt: Used to print each character
		for(int i=0;i<fullname.length();i++) {
			System.out.println(fullname.charAt(i));
			*/
			
			
			
			// Comparing two strings:
			String name1 = "Tony";
			String name2 = "Tony";
			
			//1 S1 > S2 : returns a +ve value
			//2 S1 == S2 : returns 0
			//3 S1 < S2 : returns a -ve value
			if(name1.compareTo(name2) == 0)     //Another way to compare is if(name1 == name2)
			{
				System.out.println("Strings are equal");
			}
			else {
				System.out.println("Strings are not equal");
			}
			
			
		}
		
	}
