package first_page;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public enum Personality {
    
    one("LORD DE WORDE","@start of you turn you control : 7 areas in 2players game / 5 areas in 3players game / 4 areas in 4players game"),
    two("LORD RUST","@start of you turn you control : 7 areas in 2players game / 5 areas in 3players game / 4 areas in 4players game"),
    three("LORD SELACHII","@start of you turn you control : 7 areas in 2players game / 5 areas in 3players game / 4 areas in 4players game"),
    four("DRADON KING OF ARMS","@start of you turn there are 8 or more trouble markers on the board"),
    five("COMMANDER VIMES","if nobody else wins by the time the draw pile has been exhausted. if no one is C-Vimes in players then count points"),
    six("CHRYSOPRASE","@start of you turn your net worth is $50 or more"),
    seven("LORD VETINARI","@start of you turn you have minions in: 11 areas in 2players game / 10 areas in 3players game / 9 areas in 4players game");

    private final String name;
    private final String description;
    
    Personality(String id,String desc){
    
    name = id;
    description = desc;
    
    }
    
    public String getName(){
        return name;
    }
    public String getDesc(){
        return description;
    }
    
}
 