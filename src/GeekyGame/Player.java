package GeekyGame;

import java.util.Scanner;
import java.io.BufferedInputStream;

public class Player {
	private int type;
	private static int mode;
	
	public Player(int type,int mode)
	{
		this.type=type;
		this.mode=mode;
	}
	
	public int[] getInput()
	{	Scanner scan= new Scanner(System.in);
		String n;
		for(;;) 
		{	
			n=scan.nextLine();
			if(n.length()==type&&tryInput(n,type)==true) 
			{
				
				int[] num=new int[256];
				for(int i=0;i<type;i++)
				{
					num[i]=n.charAt(i);
				}
				return num;
			}
			else 
			{
				if(n=="I Give Up")
				{
					break;
				}
				else
					System.out.println("Bad Input. Enter again");
			}
		}
		int[] num= {-1};
		return num;
	}
	
	private static boolean tryInput(String s, int type)
	{
		if(mode==1&&s.charAt(0)=='0')return false;
		for(int i=0;i<type;i++)
		{
			for(int j=0;j<type;j++)
			{
				if(s.charAt(i)==s.charAt(j)&&i!=j)return false;
			}
		}
		return true;
	}
}
