class MyEmployee{
	private int id;
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	public void setId(int i){
		id = i;
	} 
	public int getId(){
		return id;
	}
}
public class Modifiers {
	public static void main(String[] args){
		MyEmployee = new MyEmployee();
		//harry.id = 45;
		//harry.name = "CodeWithHarry ---> Throws an error due to private access modifier
		harry.setName("CodeWithHarry");
		System.out.println("harry.getName()");
	}
}                             