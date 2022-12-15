class User {
      int id;
	  String name;
	  int salary;
	  
	  User(int userId, String userName) {
		  id = userId;
		  name = userName;
	  }
	  
	  User(int userId, String userName, int userSalary) {
		  this(userId, userName);
		  salary = userSalary;
	  }
	  
	  public static void main(String[] args) {
		  User instructor = new User(1002, "Iram", 50000);
		  System.out.println("Name: " + instructor.name);
	  }
}
  