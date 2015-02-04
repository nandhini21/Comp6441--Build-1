package Discworld;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class Player 
{

	String Personality;
	String Color;
	
	String [] CardsInHand = new String [5];
	String [] Property = new String [6];

	int ini_cashInHand=10;
	int ini_buildInHand=6;
	int ini_minionInHand=12;
	ArrayList l1=new ArrayList();
	HashMap map = new HashMap();
	boolean turn = false;
	public void Changes(int player_num,int num) throws NumberFormatException, IOException 
	{
			// TODO Auto-generated method stub
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("\n1.Minions\n2.Cash:\n3.Buildings\nEnter to which changes are to be made:");
			int num1=Integer.parseInt(br.readLine());
			switch(num1)
			{
				case 1:
					System.out.println("Enter the number of minions:(for add 1st)");
					int add=Integer.parseInt(br.readLine());
					int sub=Integer.parseInt(br.readLine());
					l1.add(minion(add,sub,player_num));
					l1.add(cash(0, 0,player_num));
					l1.add(building(0, 0,player_num));
					map.put(1,l1);
					break;
				case 2:
					System.out.println("Enter the Cash amount:(for add 1st)");
					int add1=Integer.parseInt(br.readLine());
					int sub1=Integer.parseInt(br.readLine());
					l1.add(minion(0, 0,player_num));
					l1.add(cash(add1,sub1,player_num));
					l1.add(building(0, 0,player_num));
					map.put(1, l1);
					break;
				case 3:
					System.out.println("Enter the number of Building:(for add 1st)");
					int add2=Integer.parseInt(br.readLine());
					int sub2=Integer.parseInt(br.readLine());
					l1.add(minion(0, 0,player_num));
					l1.add(cash(0, 0,player_num));
					l1.add(building(add2,sub2,player_num));
					map.put(1, l1);
					break;
				
			}
			
			
	}
	int minion(int add,int sub,int player_num)
	{
		int a=add;
		int b=sub;
		int p=player_num;
		int minionInHand=ini_minionInHand + a - b;
		System.out.println("Minions in hand for Player "+p+":" +minionInHand);
		return minionInHand;
	}
	int cash(int add,int sub,int player_num)
	{
		int a=add;
		int b=sub;
		int p=player_num;
		int cashInHand=ini_cashInHand + a - b;
		System.out.println("Cash in hand for Player "+p+":" +cashInHand);
		return cashInHand;
	}
	int building(int add,int sub,int player_num)
	{
		int a=add;
		int b=sub;
		int p=player_num;
		int buildInHand=ini_buildInHand + a - b;
		System.out.println("Buildings in hand for Player "+p+":" +buildInHand);
		return buildInHand;
	}
	
	public BiFunction playerProp() throws IOException
	{
		System.out.println("Size of l1: " + l1.size());
		System.out.println("Contents of list: " + l1);
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
	      serialization();
	      deserialize();
		return null;
	      
	}
	/**Serialization
	 * @throws IOException 
     * 
     */
	void serialization() throws IOException
	{
		  FileOutputStream fileOut =new FileOutputStream("C:/Users/admin/Desktop/APP/info.ser");
	      ObjectOutputStream out = new ObjectOutputStream(fileOut);
	      out.writeObject(map);
	      out.close();
	      fileOut.close();
	      System.out.printf("Serialized data is saved in C:/Users/admin/Desktop/APP/info.ser");
	}
	      /**Deserialization
	       * 
	       */
	void deserialize()
	{
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("C:/Users/admin/Desktop/APP/info.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         map = (HashMap) in.readObject();
	         in.close();
	         fileIn.close();
	      }
	      catch(IOException i1)
	      {
	         i1.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println(" class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("\nDeserialized File...");
	      System.out.println("Minion, Cash, Building: " + map);
	     // System.out.println("Cash: " + map.address);
	     // System.out.println("Building: " + map.SSN);
	}
}
