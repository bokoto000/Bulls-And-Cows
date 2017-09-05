package GeekyGame;

import java.util.*;

import GeekyGame.GameEngine;

public class Menu {
	private static String[] games= {"Bulls and Cows"};
	private static int numberOfGames=1;
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to GeekyGames. Pick a game:\n");
		for(int i=0;i<numberOfGames;i++)
		{
			System.out.println(games[i]);
		}
		getGame();
	}
	
	public static void show()
	{
		System.out.println("Welcome to GeekyGames. Pick a game:\n");
		for(int i=0;i<numberOfGames;i++)
		{
			System.out.println(games[i]);
		}
	}
	
	public static void getGame()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("How hard do you want it?");
		String n;
		for(;;)
		{
			n=scan.nextLine();
			if(tryInput(n))break;
			System.out.println("Bad Input. Try again!");
		}
		int type=Integer.parseInt(n);
		System.out.println("Pick mode:\nnormal\nhell");
		int mode=0;
		for(;;) {
			String s=scan.nextLine();
			if(s.equals("normal"))mode=1;
			if(s.equals("hell"))mode=2;
			if(mode==0)System.out.println("No such choice. Pick again.");
			else break;
		}
		GameEngine engine=new GameEngine(type, mode);
		scan.close();
	}
	public static boolean tryInput(String input)
	{
		try
		{
			int nam=Integer.parseInt(input);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
	}
}
