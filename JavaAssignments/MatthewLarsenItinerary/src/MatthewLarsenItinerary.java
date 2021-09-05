/**
 * This program prompts the user to choose a series of destinations and then displays 
 * an itinerary on the console window
 * 
 * @author Matthew Larsen
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MatthewLarsenItinerary 
{

	public static void main(String[] args) 
	{
		System.out.println("This program will prompt you for a series of destinations.");
		System.out.println("Then it will display your travel route based on your entries.\n");
		System.out.println("Please enter your destinations [Enter done to finish]:");
		
		
		StringBuilder itinerary = new StringBuilder();
		ArrayList<String> destinations = new ArrayList<String>();
		int count = 0;
		String place = new String();
		boolean end = false;
		Scanner input = new Scanner(System.in);
		/**
		 * This do while loop gets the input of the user and then
		 * stores it in the ArrayList declared above and then afterwards
		 * a StringBuilder object retrieves the destinations and prints
		 * the itinerary to the console window.
		 */
		do
		{
			
			System.out.println("     Destination: ");
			destinations.add(input.nextLine());
			place = destinations.get(count);
			
			if (place.equalsIgnoreCase("done"))
			{
				end = true;
			}
			else 
			{
				place = place.toUpperCase();
				itinerary.append(place + " to ");
				count++;
			}
			
			
		} while(!end);
		
		input.close();
		itinerary.delete((itinerary.length() - 4), itinerary.length());
		System.out.println("Itinerary: "+ itinerary);
		
	}

}
