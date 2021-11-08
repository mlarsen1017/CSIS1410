import java.util.Scanner;

public class Trapezoid extends Shape
{
	int a = 0;
	int b = 0;
	int h = 0;
	int area = 0;
	
	Scanner input = new Scanner(System.in);
	
	public Trapezoid()
	{
		System.out.println("Trapezoid");
		System.out.println("Enter the top base: ");
		this.a = Integer.parseInt(input.nextLine());
		System.out.println("Enter the bottom base: ");
		this.b = Integer.parseInt(input.nextLine());
		System.out.println("Enter the height: ");
		this.h = Integer.parseInt(input.nextLine());
		
		
	}
	
	public void area()
	{
		area = ((a + b)/2)*h;
		System.out.println("Area = " + area);
		
	}

}
