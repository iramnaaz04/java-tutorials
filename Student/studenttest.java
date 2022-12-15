class Studenttest {

      public static void main(String[] args) {
          int[] studentIds = new int[] {1000, 1002, 1003};
          Student student1 = new Student(studentIds[0], "joan");
          student1.gender = "female";
		  
		  Student student2 = new Student(studentIds[1], "ankita");
          student2.gender = "female";
		  
		  Student student3 = new Student(studentIds[2], "raj");
          student3.gender = "male";
		  
		  System.out.println("Name of student1: " + student1.name);
		  System.out.println("Name of student2: " + student2.name);
		  System.out.println("Name of student3: " + student3.name);
	  }
}

 		  