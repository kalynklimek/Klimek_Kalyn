import java.util.Scanner;
public class Rectangle 
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		System.out.println("Please enter the length of the rectangle:");
		l = kb.nextDouble();
		System.out.println("Please enter the width of the rectangle:");
		w = kb.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim ()
	{
		perimeter = (2*l) + (2*w);
	}
	
	public static void print()
	{
		System.out.printf("Your rectanngle is %.5f ft around.", perimeter); 
	}
}