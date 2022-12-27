class Array {
	public static void main(String[] args) {
		//There are 3 main ways to create an array in java
		 int [] marks = new int[5];  // This can also be written as :
		//2] int[] marks;
		//3] int [] marks = {89,56,86,56}
		//marks = new int[5];
		marks[0] = 100;
		marks[1] = 200;
		marks[2] = 300;
		marks[3] = 400;
		marks[4] = 500;
		System.out.println(marks[4]);
		System.out.println(marks.length); 
		
		//Displaying the Array (for loop)
		System.out.println("Printing using for loop"); 
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
		//Quick Quiz: Displaying the Array (for-each loop)
		System.out.println("Printing using for-each loop");
		for(int element: marks){
			System.out.println(element);
		}
	}
}