class Employee{
	int id;
	int salary;
	String name;
	public void printDetails(){
		System.out.println("My id is " + id);
		System.out.println("My name is " + name);
	}
	
	public int getSalary(){
		return Salary;
	}
}

public class Custom_class {
	public static void main(String[] args) {
		System.out.println("This is our custom class");
		Employee harry = new Employee();  //Intantiating a new Employee Object
		Employee john = new Employee();   //Intantiating a new Employee Object
		
		//Setting properties for harry
		harry.id = 12;
		harry.salary = 34000;
        harry.name = "Code with me";
		
		//Setting attributes for john
		john.id = 14;
		john.salary = 12000;
		john.name = "Iram";
		
		//Printing the Attributes
		harry.printDetails();
		john.printDetails();Salary();
		System.out.println(Salary);
	//	System.out.println(harry.id);
	//	System.out.println(harry.name);
		}
}


		  