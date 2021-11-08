import java.util.Scanner;

public class Ellipse extends Shape 
{
	int a = 0;
	int b = 0;
	int area = 0;
	
	Scanner input = new Scanner(System.in);
	
	public Ellipse()
	{
		System.out.println("Ellipse");
		System.out.println("Enter the top radius: ");
		this.a = Integer.parseInt(input.nextLine());
		System.out.println("Enter the bottom radius: ");
		this.b = Integer.parseInt(input.nextLine());
		
	
	}
	
	public void area()
	{
		area = (int)(Math.PI * a * b);
		System.out.println("Area = " + area);
		
	}

}
