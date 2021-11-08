import java.util.Scanner;

public class Square extends Shape
{
	int s = 0;
	int area = 0;
	
	Scanner input = new Scanner(System.in);
	
	public Square()
	{
		System.out.println("Square");
		System.out.println("Enter the side: ");
		this.s = Integer.parseInt(input.nextLine());
	}
	
	public void area()
	{
		area = s * s;
		System.out.println("Area = " + area);
		
	}

}
