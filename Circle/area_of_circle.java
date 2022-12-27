import java.util.Scanner;
class area_of_circle {
	public static void main(String[] args) {
		// Print area of circle;
		   int r;
        double pi = 3.14, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = sc.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
	}
}
