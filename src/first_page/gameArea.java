/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_page;

/**
 *@param areaName name of the area
 * @param areaNumber number of the area
 * @param buildCost cost to build the building on the area
 * @param minionsPresent minions on the area
 * @param buildingPresent area contains building or not
 * @param trollsPresent number of trolls on the area
 * @param demonsPresent number of demons on the area
 * @param troubleMarker area contains trouble marker or not
 * @author Dell
 */
public class gameArea {
    
    
    	public String areaName;
	public int areaNumber;
	public String areaPower;
	public int buildCost;
	
	public int[] minionsPresent = new int[4]; //RGBY
	public String buildingPresent = null;
	public int trollsPresent = 0;
	public int demonsPresent = 0;
	
	public boolean troubleMarker = false;

        
        public void addMinion(){
                
        }
        public void removeMinion(){
        
        }
        public void addBuilding(){
               
        }
        public void removeBuilding(){
                
        }
        public void addDemon(){
                
        }
        public void removeDemon(){
                
        }
        public void addTroubleMarker(){
        
        }
        public void removeTroubleMarker(){
        
        }        
        public void addTroll(){
        
        }
        public void removeTroll(){
        
        }
        
        
        
}
