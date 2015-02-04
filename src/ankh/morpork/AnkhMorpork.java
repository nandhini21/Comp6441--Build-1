/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ankh.morpork;
import first_page.Player;
import first_page.first_page;
import java.util.*;
/** Shuffle the cards
 *
 * @author Dell
 * @deck(collection,collection) creates stack of green and brown cards
 * @param greenDeck list for green cards
 * @param brownDeck list for brown cards
 */
public class AnkhMorpork {

    static Stack<String> stack = new Stack<String>();	
    public static String[] players;
    public static String[][] details;
    public static String[] personality;
    int i=0;
    public void shuffleCards(int no_of_players){
		
		List<String> greenDeck = new ArrayList<String>();
		List<String> brownDeck = new ArrayList<String>();
		personality = new String[7];
                
                HashMap<Integer,String> map = new HashMap<Integer,String>();
                map.put(1, "LORD DE WORDE");
                map.put(2, "LORD RUST");
                map.put(3, "LORD SELACHII");
                map.put(4, "DRADON KING OF ARMS");
                map.put(5, "COMMANDER VIMES");
                map.put(6, "CHRYSOPRASE");
                map.put(7, "LORD VETINARI");
                
                if(no_of_players == 2)
                    map.remove(6);
                List keys = new ArrayList(map.keySet());
                    Collections.shuffle(keys);
                    for (Object o : keys) {
                        // Access keys/values in a random order
                       personality[i] =  map.get(o);
                       i++;
                    }
                
		for(int i = 1; i <= 48;i++)
			greenDeck.add("gr" + i);
                
		for(int i = 1; i <= 53;i++)
			brownDeck.add("br" + i);
	
                Collections.shuffle(greenDeck);
		System.out.print("Green Deck after shuffle:");
		System.out.printf("%s", greenDeck);
		System.out.print("\n");
		Collections.shuffle(brownDeck);
		System.out.print("Brown Deck after shuffle:");
		System.out.printf("%s", brownDeck);
		
		deck(greenDeck,brownDeck);	
	}
	
        /**
         * deck for creating a shuffled deck
         * 
         * @param stack stack of shuffled cards
         * @param green collection of green cards
         * @param brown collection of brown cards
         */
	public static void deck(Collection<String> green, Collection<String> brown){
	
		Collections.reverse((ArrayList)brown); //no need
		Collections.reverse((ArrayList)green);	// no need
		
		List<String> shuffledDeck = new ArrayList<String>(brown);
		
		shuffledDeck.addAll(green);
		
		Iterator<String> sDeck = shuffledDeck.iterator();
			while(sDeck.hasNext())
				stack.push(sDeck.next());	
		
		if(stack.isEmpty())
			System.out.println("no more cards");
		else
			System.out.println("\nstack of Brown(bottom)/Green(top) cards: ");
			System.out.printf("%s TOP", stack);
			System.out.printf("\n%s TOP", stack);			
			
	}
        
        /**
         * next_turn displays the details of current player
         * @param turn[] current active player turn is true
         * @param i current active player
         */
        
        public void next_turn(int i){
            boolean[] turn = null;        
                   turn = new boolean[first_page.playerObj.length];

            for (int j=0;j<first_page.playerObj.length;j++) 
                first_page.playerObj[j].turn = false;
        
                Arrays.fill(turn,Boolean.FALSE);
                turn[i] = true;
                System.out.println("active player is: " + (i+1) );
                first_page.playerObj[i].turn = true;
                System.out.println("details of active player: " + first_page.playerObj[i].Color);
                System.out.println("details of active player: " + first_page.playerObj[i].Personality);
                System.out.println("details of active player: " + first_page.playerObj[i].turn);
                
                for(int j=0;j<5;j++){
                    System.out.println("details of active player: " + first_page.playerObj[i].CardsInHand[j]);
                }
        }
        
        
        /**
         * distribute method to distribute cards to each player
         * @param players final array of colors assigned to each player
         * @param details holding cards in hand for each player 
         * @param stack holds remaining cards of the deck 
         */
        public void distribute(String[] players){
        
            details = new String[players.length][5];
              for(int i =0;i<5;i++){
                for(int j=0;j<players.length;j++){            
                    details[j][i] = stack.pop();
                }
            }
            for(int i=0;i<players.length;i++){
                for(int j=0;j<5;j++)
                {
                    System.out.println("player " + (i+1) + ": " + players[i] + " " + details[i][j]);
                    first_page.playerObj[i].CardsInHand[j] = details[i][j];
                }
                first_page.playerObj[i].Personality = personality[i];
            }
            
           }
        /**
         * turn assigns turn to number of players
         * @param no_of_players total number of players
         * @param colors array of colors
         * @param players array of colors assigned to each player
         * @see distribution(String[] ) method to distribute cards to each player by passing value of colors assigned to each player 
         */
        public void turn(int no_of_players){
        
            String[] colors = {"red","blue","green","yellow"};
            int length = colors.length;
            
            for(int i=0;i< length;i++){
                int s = i + (int)(Math.random()*(length-i));
                String temp = colors[s];
                colors[s] = colors[i];
                colors[i] = temp;
               players = new String[no_of_players];
            }
       
            for(int i=0;i<no_of_players;i++){
                players[i] = colors[i];
                first_page.playerObj[i].Color = colors[i];
                System.out.println("\nplayer " + (i+1) + ": " + first_page.playerObj[i].Color);
            }
            
            distribute(players);
        }

    /**
     * @param args the command line arguments
     */
}