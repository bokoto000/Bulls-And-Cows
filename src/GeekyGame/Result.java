package GeekyGame;

public class Result {
	private static int bulls;
	private static int cows;
	public Result()
	{
		bulls=0;
		cows=0;
	}
	
	public void addBull()
	{
		bulls++;
	}
	
	public void addCow()
	{
		cows++;
	}
	
	public int getBulls()
	{
		return bulls;
	}
	
	public int getCows()
	{
		return cows;
	}
}
