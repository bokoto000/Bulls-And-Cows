package GeekyGame;

import GeekyGame.BullsAndCows;
import GeekyGame.Player;
import GeekyGame.Result;

public class GameEngine {
	private static int type;
	private static int mode;
	public GameEngine(int type, int mode)
	{
		this.type=type;
		this.mode=mode;
		BullsAndCows game=new BullsAndCows(type, mode);
		/*for(int i=0;i<type;i++)
		{
			if(mode==1)
			System.out.print(game.getInput()[i]-48+" ");
			else
			System.out.print(game.getInput()[i]+" ");	
		}*/
		System.out.println();
		Player player=new Player(type, mode);
		int[]comp=game.getInput();
		for(;;)
		{
			Result result=new Result();
			int[] man = player.getInput();
			result = compare(comp, man);
			if(result.getBulls()==type) 
			{	
				System.out.println("Gratz!!You win!");
				break;
			}
			else
			{
				System.out.println("Bulls: "+result.getBulls()+" Cows: "+result.getCows());
			}
		}
	}
	public static Result compare(int[] game, int[] player)
	{
		Result result=new Result();
		for(int i=0;i<type;i++)
			for(int j=0;j<type;j++)
			{
				if(i==j&&game[i]==player[j])result.addBull();
				if(i!=j&&game[i]==player[j])result.addCow();
			}
		return result;
	}
}
