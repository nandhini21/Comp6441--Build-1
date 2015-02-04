package Discworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Bank {
	ArrayList l1=new ArrayList();
	HashMap map = new HashMap();
	int players[];
	public int[] Minions(int players) 
		{
			// TODO Auto-generated method stub
			int ini_minion_num[]=new int[5];
			System.out.println("Number of minions for each player:");
			for(int i=1;i<=players;i++)
			{
				ini_minion_num[i]=12;
				//System.out.println("Player " +i+ ":" +ini_minion_num[i]);
			}
			return ini_minion_num;
			
		}
		
	public int[] Cash(int players) 
		{
				// TODO Auto-generated method stub
				int ini_cash_amt[]=new int[5];
				System.out.println("Cash amount for players");
				for(int i=1;i<=players;i++)
				{
					ini_cash_amt[i]=10;
					
					//System.out.println("Player "+i+ ":" +ini_cash_amt[i]);
				}
				return ini_cash_amt;
				
		}
		
	
	public String[] Color_assign(int players)
		{
		    String[] colorArray = {"BLUE", "RED", "GREEN", "YELLOW"};
	
		    shuffleArray(colorArray);
		    System.out.println("Colors assigned");
			    for (int i = 1; i <= players; i++)
			    {
			      
			      System.out.println("Player "+i+":"+colorArray[i]);
			    }
		    System.out.println();
		    return colorArray;
		}

	void shuffleArray(String[] colorArray)
		{
		    Random rnd = new Random();
		    for (int i = colorArray.length - 1; i > 0; i--)
		    {
		      int index = rnd.nextInt(i + 1);
		      // Simple swap
		      String a = colorArray[index];
		      colorArray[index] = colorArray[i];
		      colorArray[i] = a;
		    }
	  }

	
		public int[] Buildings(int players) 
		{
			// TODO Auto-generated method stub
			int ini_building_num[]=new int[5];
			System.out.println("Initial building for players");
			for(int i=1;i<=players;i++)
			{
				ini_building_num[i]=6;
				//System.out.println("Player "+i+ ":" +ini_building_num[i]);
			}
			return ini_building_num;
			
		}



}
