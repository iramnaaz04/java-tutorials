class Sorting {
	public static void main(String[] args){
		int [] intArray = new int [] {47,48,70,86,32,90};
		int marks = 0;
		
		System.out.println("Original array: ");
		for (int i = 0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		for (int i = 0; i <intArray.length; i++) {     
          for (int j = i+1; j <intArray.length; j++) {     
              if(intArray[i] >intArray[j]) {      //swap elements if not in order
                 marks = intArray[i];    
                 intArray[i] = intArray[j];    
                 intArray[j] = marks;    
               }     
            }     
        }    
        //print sorted array    
        System.out.println("\nArray sorted in ascending order: ");    
        for (int i = 0; i <intArray.length; i++) {     
            System.out.print(intArray[i] + " ");    
        }    
		
	}
}