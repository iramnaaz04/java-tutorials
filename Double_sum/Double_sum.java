class Double_sum{
	public static int doublesum(int a , int b){
	 
		int sum = a + b;
		if(a == b){
			sum = sum*2;
		}
		return sum;
	}
	
	public static void main(String[] args){
		int sum = 0;
		sum = doublesum(2,2);
		System.out.print(sum);
	}
}