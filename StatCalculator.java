//Mitchell Boesche
//Format below

//First Name, Last Name, AB, Hits, Strikeouts, Walks, Singles, Doubles, Triples, Homeruns, RBI

//Baseball Stats
import java.io.*;
import java.util.Scanner;

public class StatCalculator 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inputFile =  new File ("BaseballStats.txt"); //input file
		Scanner in = new Scanner (inputFile); //Scans input file
		PrintStream output = new PrintStream("BaseballStatsOutput.txt"); //creates output file
		while (in.hasNextLine()) //checks to see if another line is present
		{
			String FirstName = in.next(); //sets next item to FirstName
			String LastName = in.next(); //sets next item to LastName
			double AB = in.nextInt(); //sets next item to AB
			double Hits = in.nextInt(); //sets next item to Hits
			int Strikeouts = in.nextInt(); //sets next item to Strikeouts
			int Walks = in.nextInt(); //sets next item to Walks
			int Singles = in.nextInt(); //sets next item to Singles
			int Doubles = in.nextInt(); //sets next item to Doubles
			int Triples = in.nextInt(); //sets next item to Triples
			int Homeruns = in.nextInt(); //sets next item to Homeruns
			int RBI = in.nextInt(); //sets next item to RBI
			BaseballPlayer Player = new BaseballPlayer (FirstName, LastName, AB, Hits, Strikeouts, Walks, Singles, Doubles, Triples, Homeruns, RBI); //creates object
			if (Hits + Strikeouts + Walks>AB) //checks to see if AB is > Hits + Strikeouts + Walks
			{
				System.out.println("Player: " + Player.getName()); //prints out player name
				System.out.println("AB cannot be less than Hits + Strikeouts + Walks!"); //prints exception
				System.out.println("");
				output.println("Player: " + Player.getName());
				output.println("AB cannot be less than Hits + Strikeouts + Walks!");
				output.println("");
			}
			else
			{
				System.out.println("Player: " + Player.getName()); //prints out player name
				System.out.printf("Average: %.3f", Player.getAverage()); //prints out player average
				System.out.println("");
				System.out.printf("On Base Percentage: %.3f", Player.getOBP()); //prints out player on base percentage
				System.out.println("");
				System.out.printf("Slugging Percentage: %.3f", Player.getSlugging()); //prints out player slugging percentage
				System.out.println("");
				System.out.printf("On Base plus Slugging: %.3f", Player.getOPS()); //prints out player on base plus slugging percentage
				System.out.println("");
				System.out.println("Strikeouts: " + Player.getStrikeouts()); //prints out player strikeouts
				System.out.println("Walks: " + Player.getWalks()); //prints out player walks
				System.out.println("Singles: " + Player.getSingles()); //prints out player singles
				System.out.println("Doubles: " + Player.getDoubles()); //prints out player doubles
				System.out.println("Triples: " + Player.getTriples()); //prints out player triples
				System.out.println("Homeruns: " + Player.getHomeruns()); //prints out player homeruns
				System.out.println("RBI: " + Player.getRBI());
				System.out.println("");
				output.println("Player: " + Player.getName());
				output.printf("Average: %.3f", Player.getAverage());
				output.println("");
				output.printf("On Base Percentage: %.3f", Player.getOBP());
				output.println("");
				output.printf("Slugging Percentage: %.3f", Player.getSlugging());
				output.println("");
				output.printf("On Base plus Slugging: %.3f", Player.getOPS());
				output.println("");
				output.println("Strikeouts: " + Player.getStrikeouts());
				output.println("Walks: " + Player.getWalks());
				output.println("Singles: " + Player.getSingles());
				output.println("Doubles: " + Player.getDoubles());
				output.println("Triples: " + Player.getTriples());
				output.println("Homeruns: " + Player.getHomeruns());
				output.println("RBI: " + Player.getRBI());
				output.println("");
			}
		}
		in.close();
		output.close();
	}
}
