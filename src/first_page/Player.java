package first_page;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@param Personality stores player's personality
 * @param Color player's color
 * @param CardsInHand[] five cards for each player
 * @param cashInHand amount that player currently holds
 * @param buildInHand remaining buildings with players
 * @param minionInHand remaining minions with players
 * @param turn true/false value for each player
 * @author Dell
 */
public class Player implements Serializable {
    
    
        public int save_turn; 
        public String Personality;
	public String Color;
	
	public String [] CardsInHand = new String [5];
	public String [] Property = new String [6];

	public int cashInHand;
	public int buildInHand;
	public int minionInHand;
	
	public boolean turn = false;
	
        
 }
