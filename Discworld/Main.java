package Discworld;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main 
{
	static HashMap map = new HashMap();
	static ArrayList l2=new ArrayList();
	public static void main(String args[]) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players:");
		int num=Integer.parseInt(br.readLine());
		//System.out.println("Load or resume:?!");
		loadGame(num);
		System.out.println("Changes are made to player?:");
		int num1=Integer.parseInt(br.readLine());		
		switch(num1)
		{
			case 1: 
				Player p1=new Player();
				p1.Changes(num1,num);
				p1.playerProp();
				break;
			case 2:
				Player p2=new Player();
				p2.Changes(num1,num);
				//map.put(p2.playerProp());
				break;
			case 3:
				Player p3=new Player();
				p3.Changes(num1,num);
				p3.playerProp();
				break;
			case 4:	
				Player p4=new Player();
				p4.Changes(num1,num);
				p4.playerProp();
				break;
		}
							
	}
			
	public static void loadGame(int player)
	{
			int players=player;
			Bank m1=new Bank();
			l2.add(m1.Color_assign(players));
			l2.add(m1.Minions(players));
			l2.add(m1.Cash(players));
			l2.add(m1.Buildings(players));
			map.put(1,l2);
			System.out.println("List in map:");
			Set set = map.entrySet();
		    Iterator i = set.iterator();
		      while(i.hasNext()) 
		      {
		         Map.Entry me = (Map.Entry)i.next();
		         //System.out.print(me.getKey() + ": ");
		         System.out.println(me.getValue());
		      }
		      System.out.println();
	}
	
 }
