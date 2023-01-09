class Employee1{
	int salary;
	String name;
	
	public int getSalary(){
	return salary;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
}

class CellPhone{
	public void ring(){
		System.out.println("Ringing..");
	}public void vibrate(){
		System.out.println("Vibrating...");
	}
		public void callFriend(){
			System.out.println("Call iram");
		}
	
}

class Square{
	int side;
	public int area(){
	   return side*side;
	}
	public int perimeter(){
		return 4*side;
	}
}

class Rectangle{
	int length;
	int width;
	int area;
	int perimeter;
	public int calcArea(){
		area = length*width;
		return area;
	}
	public int calcPerimeter(){
		perimeter = 2*(length*width);
		return perimeter;
	}
}
class Tommy{
	public void hit(){
		System.out.println("Hitting the enemy");
	}
	public void run(){
	    System.out.println("Running from the enemy");
	}
	public void fire(){
		System.out.println("Getting fired need assistant");
	}
}


public class OOPs_practice {
	public static void main(String[] args){
		/*
		//Problem 1
		Employee1 harry = new Employee1();
		harry.setName("CodeWithIram");
		harry.salary = 233;
		System.out.println(harry.getSalary());
		System.out.println(harry.getName());
		
		//Problem 2
		CellPhone apple = new CellPhone();
		apple.callFriend();
		apple.vibrate();
		apple.ring();
		
		
		//Problem 3
		Square sq = new Square();
		sq.side = 786;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
		*/
		
		//Problem 4
		Rectangle r = new Rectangle();
		r.length = 2;
		r.width = 2;
		System.out.println("The Area of the rectangle is" + r.calcArea());
		System.out.println("The Perimeter of the rectangle is" + r.calcPerimeter());
		
		
		//Problem 5
		Tommy player1 = new Tommy();
		player1.hit();
		player1.run();
		player1.fire();
	}
}
