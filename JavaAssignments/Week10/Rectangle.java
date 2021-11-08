import java.util.Scanner;

public class Rectangle extends Shape
{
	int b = 0;
	int h = 0;
	int area = 0;
	
	Scanner input = new Scanner(System.in);
	
	public Rectangle()
	{
		System.out.println("Rectangle");
		System.out.println("Enter the base: ");
		this.b = Integer.parseInt(input.nextLine());
		System.out.println("Enter the height: ");
		this.h = Integer.parseInt(input.nextLine());
		
	
	}
	
	public void area()
	{
		area = b * h;
		System.out.println("Area = " + area);
	}

}
