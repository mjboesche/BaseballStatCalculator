
public class BaseballPlayer 
{
	String FirstName;
	String LastName;
	double AB;
	double Hits;
	int Strikeouts;
	int Walks;
	int Singles;
	int Doubles;
	int Triples;
	int Homeruns;
	int RBI;
	double Average;
	double OBP;
	double Slugging;
	double OPS;
	
	public BaseballPlayer (String name1, String name2, double AB1, double Hits1, int Strikeouts1, int Walks1, int Singles1, int Doubles1, int Triples1, int Homeruns1, int RBI1)
	{
		FirstName = name1;
		LastName = name2;
		AB = AB1;
		Hits = Hits1;
		Strikeouts = Strikeouts1;
		Walks = Walks1;
		Singles = Singles1;
		Doubles = Doubles1;
		Triples = Triples1;
		Homeruns = Homeruns1;
		RBI = RBI1;
	}
	public String getName()
	{
		return FirstName + " " + LastName;
	}
	public double getAverage()
	{
		Average = (Hits/AB);
		return Average;
	}
	public double getOBP()
	{
		OBP = (Hits + Walks)/(AB + Walks);
		return OBP;
	}
	public double getSlugging()
	{
		Slugging =((Singles) + (Doubles * 2) + (Triples * 3) + (Homeruns * 4)) / (AB);
		return Slugging;
	}
	public double getOPS()
	{
		return (OBP + Slugging);
	}
	public int getStrikeouts()
	{
		return Strikeouts;
	}
	public int getWalks()
	{
		return Walks;
	}
	public int getSingles()
	{
		return Singles;
	}
	public int getDoubles()
	{
		return Doubles;
	}
	public int getTriples()
	{
		return Triples;
	}
	public int getHomeruns()
	{
		return Homeruns;
	}
	public int getRBI()
	{
		return RBI;
	}
}
