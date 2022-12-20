public class Precedence {
public static void main(String[] args) {
	
	int a = 6*5-34/2;
	/* 
	highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity
	6*5=30 and 34/2
	30-17
	=13
    */
	int b = 60/5-34*2;
	/* 
	60/5 = 12
	34*2
	12-34*2
	12-68
	-56
	*/
	System.out.println(a);
	System.out.println(b);
	//Precedence & Associativity
}
}
	