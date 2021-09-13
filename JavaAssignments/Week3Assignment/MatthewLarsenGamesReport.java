/**
 * This program reads a text file which contains games scores from different people
 * and displays it to the console. Afterwards it will also display the person with the 
 * highest score and add a new person to the list and give a report to the console a 2nd time
 * 
 * @author Matthew Larsen
 * @version 1.0
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
public class MatthewLarsenGamesReport 
{

	public static void main(String[] args) throws IOException
	{
		File fileName = new File("GameScores.csv");
		gamerReport(fileName);
		int[] newScores = new int[]{170,150,169,170,185,186,190,187,124,157};
		addGamer(fileName, "Jimmy", newScores);
		gamerReport(fileName);
	}
	
	/**
	 * This method called gamerReport prints a game report to the console window using
	 * a csv file that it reads and calculates data like the number of gamers, the total score,
	 * and the top gamer.
	 */
	private static void gamerReport(File f) throws IOException
	{
		if (f.exists() && f.canRead())
		{
			int highScore = 0;
			int gamerCount = 0;
			
			String cvsSplitBy = ",";
			String line = "";
			String topGamer = "";
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			horizontalLine(94);
			System.out.println("Games Report");
			horizontalLine(94);
			System.out.println("Gamer\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tTotal");
			horizontalLine(94);
			
			while ((line = br.readLine()) != null)
			{
				String[] gamer = line.split(cvsSplitBy);
				int total = 0;
				
				for (int i = 0; i <= 10; i++)
				{
					if (i == 0)
					{
						System.out.print(gamer[i] + "\t");
					}
					else
					{
						total = total + Integer.parseInt(gamer[i]);
						System.out.print(gamer[i] + "\t");
					}
				}
				
				System.out.println(Integer.toString(total));
				if (highScore < total)
				{
					highScore = total;
					topGamer = gamer[0];
				}
				
				gamerCount++;
			}
			
			horizontalLine(94);
			System.out.println("# of Gamers:   " + Integer.toString(gamerCount));
			System.out.println("Top Gamer:   " + topGamer);
			
			
			br.close();
		}
	}
	
	private static void addGamer(File f, String name, int[] scores) throws IOException
	{
		FileWriter csvWriter = new FileWriter(f, true);
		csvWriter.write(name + ",");
		for (int i = 0; i <= 9; i++)
		{
			csvWriter.write((Integer.toString(scores[i])) + ",");
		}
		csvWriter.close();
	}
	
	private static void horizontalLine(int dashes)
	{
		for (int i = 1; i <= dashes; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}

}
