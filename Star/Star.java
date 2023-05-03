public class Star{
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.printf(" * ");
			}
			System.out.print("\n");
		}
		System.out.print(" ");
	}
}