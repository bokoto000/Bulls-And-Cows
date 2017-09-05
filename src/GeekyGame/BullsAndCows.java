package GeekyGame;

import java.util.*;

public class BullsAndCows {
	private static int[] num = new int[256];

	public BullsAndCows(int type, int mode) {
		Vector<Integer> v = new Vector<>();
		int n, m;
		if (mode == 1) 
		{
			for(int i=49;i<=57;i++)
			{
				v.add(i);
			}
			
			int rand=random(0,8);
			num[0]=v.get(rand);
			v.remove(rand);
			v.add(48);
			for(int i=1;i<4;i++)
			{
				rand=random(0,9-i);
				num[i]=v.get(rand);
				v.remove(rand);
			}
		} 
		else {
			n = 32;
			m = 126;
			for (int i = n; i < m; i++) {
				v.add(i);
			}
			int k=v.size();
			for (int i = 0; i < type; i++) {
				int rand = random(0, k - i -1 );
				num[i] = v.get(rand);
				v.remove(rand);
			}
		}
	}

	public int[] getInput() {
		return num;
	}

	public static int random(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}
}
