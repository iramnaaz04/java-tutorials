/*TO PRINT:
     *
	* * 
   * * *
  * * * *
 * * * * *

*/
public class Random{
	public static void main(String[] args){
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.printf(" * ");
			}
			System.out.printf("\n");
		}
		System.out.println(" ");
	}
}
