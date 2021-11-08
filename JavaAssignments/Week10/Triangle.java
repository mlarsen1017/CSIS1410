import java.util.Scanner;

public class Triangle extends Shape
{
	int b = 0;
	int h = 0;
	int area = 0;
	
	Scanner input = new Scanner(System.in);
	
	public Triangle()
	{
		
		System.out.println("Triangle");
		System.out.println("Enter the base: ");
		this.b = Integer.parseInt(input.nextLine());
		System.out.println("Enter the height: ");
		this.h = Integer.parseInt(input.nextLine());
		
	}
	
	public void area()
	{
		area = ((b * h)/2);
		System.out.println("Area = " + area);
	}
	

}
