import java.util.Scanner;

public class Circle extends Shape
{
	int r = 0;
	int area = 0;
	
	Scanner input = new Scanner(System.in);
	
	public Circle()
	{
		System.out.println("Circle");
		System.out.println("Enter the radius: ");
		this.r = Integer.parseInt(input.nextLine());
		
	
	}
	
	public void area()
	{
		area = (int)((r * r) * Math.PI);
		System.out.println("Area = " + area);
	}

}
