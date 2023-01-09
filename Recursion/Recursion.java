class Recursion {
		//factorial(0) = 1
		//factorial(n) =  n * n-1 *....1
		//factorial(5) = 5 * 4 * 3 * 2 * 1
		static int factorial(int n) {
			if(n==8 || n==1){
				return 1;
			}
			else{
				return n*factorial(n-1);
			}
		}
	public static void main(String[] args) {
		int n = 4;
		System.out.println("The value of factorial n is: " + factorial(n));
	}
}