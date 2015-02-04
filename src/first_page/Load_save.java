package first_page;


import first_page.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Load_save {
        first_page fp = new first_page();
        String filename = " ";//player.ser";
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Player> playersRead = new ArrayList<>();

    public boolean savePlayers(String filename, ArrayList<Player> listOfPlayers){
        boolean status = false;
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
            fos = new FileOutputStream(filename);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(listOfPlayers);
            
            // close the output stream
            oos.close();
            
            // set status
            status = true;
        } catch (Exception e) {
            System.out.println("Exception in MainClass.savePlayers " + e.getMessage());
            e.printStackTrace(); 
        }
        
        return status;
    }
    
    public ArrayList<Player> readPlayers(String filename){
        ArrayList<Player> players = null;
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(filename);
            ois = new ObjectInputStream(fis);
            
            // read the object
            players = (ArrayList<Player>) ois.readObject();
            
            // close input stream 
            ois.close();            
        } catch (Exception e) {
            System.out.println("Exception in MainClass.readPlayers " + e.getMessage());
            e.printStackTrace();
        }
   
        return players;
    }
      
        /*
    saving active_turn variable in object p and storing it in arraylist
    adding all the values for each player in arraylist
    
    */
        public void save(String name){
        players.add(second_page.p);
        
        for(int i=0;i<first_page.playerObj.length;i++)
            players.add(first_page.playerObj[i]);
            filename = name + ".ser";
//        Load_save obj = new Load_save();
       boolean status = new Load_save().savePlayers(filename, players);
       
       if (status) {
            System.out.println("Saved object to file : " + filename + " successfully.");
        }
        else{
            System.out.println("Saving object failed.");
        }
       
        System.out.println("\n\nReading Object from file : " + filename);
        
        }
    
        public void load(){
        
             
        ArrayList<Player> playersRead = new ArrayList<>();
    
        playersRead = new Load_save().readPlayers(fp.filename.getText());
        
        System.out.println("Read players are : " + playersRead.size() + "\n");
        
        // print playersRead      
        for (Player player : playersRead) {
            System.out.println(player.toString() + "\n");
        

        }
        
        }        
}
