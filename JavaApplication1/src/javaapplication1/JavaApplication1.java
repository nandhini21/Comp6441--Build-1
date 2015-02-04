package JavaApplication1;
import java.io.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
public class JavaApplication1 extends JFrame {
  public static final int Dw=300;
  public static final int Dh=300;
    void simpleframe()
    {
        setSize(Dw,Dh);
      
    }
    public static void main(String[] args)
    throws java.io.IOException{
     JavaApplication1 n=new JavaApplication1();
     n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     n.setVisible(true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Random generator = new Random();
        double money[]={0.01, 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000};
        double gameBoard[][] = new double[13][2];
        double fakeBoard[][] = new double[13][2];
        double firstHalf[] ={0.01, 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750};
        double secondHalf[] = {1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000};
        int row1[]= {1, 2, 3, 4, 5,6};
        int middleRows[][] = new int[2][7];
        int row2[] = {7, 8, 9, 10, 11, 12, 13};
        int row3[] = {14, 15, 16, 17, 18, 19, 20};
        int row4[] = {21, 22, 23, 24, 25, 26};
        int dealOrNoDeal;
        
         for (int i= 0; i < money.length - 1; i++) {
           int number = generator.nextInt(money.length - i);
           double temp = money[i];
            money[i] = money[number + i];
            money[number + i] = temp;
            //Randomizes cases
        }   
    
    
    
    for(int r=0; r<gameBoard.length; r++){
        for(int c=0; c<gameBoard[r].length; c++){
                
                gameBoard[r][0] = money[r];
                gameBoard[r][1] = money[r+12];
    }
}
        for(int r=0; r<fakeBoard.length; r++){
                for(int c=0; c<fakeBoard[r].length; c++){
                    fakeBoard[r][0] = firstHalf[r];
                    fakeBoard[r][1] = secondHalf[r];
                    System.out.print(fakeBoard[r][c] + "\t");
                }
                System.out.println();
            }  
            System.out.print("  ");
            for(int i=0; i<row1.length; i++){
                System.out.print(row1[i] + " ");
            }
    
            System.out.println();
    
            
            for(int i=0; i<row2.length; i++){
                System.out.print(row2[i] + " ");
            }
            
            System.out.println();
            
            for(int i=0; i<row3.length; i++){
                System.out.print(row3[i] + " ");
            }
            
            System.out.println(" ");
            
            
            for(int i=0; i<row4.length; i++){
                System.out.print(row4[i] + " ");
            }
            System.out.println();
    
    
    int playerCase;
    double playerCaseValue;
    
    System.out.print("Please pick your case (1-26): ");
    playerCase = Integer.parseInt(br.readLine());
    playerCaseValue = money[playerCase];
    pickCase(playerCase, row1, row2, row3, row4);
    int caseOpenInput;
    
    int casesToOpen = 6, roundNum=1;
     while(casesToOpen > 1){
        for(int e=1; e<=casesToOpen; e++){
            for(int r=0; r<fakeBoard.length; r++){
                for(int c=0; c<fakeBoard[r].length; c++){
                    System.out.print(fakeBoard[r][c] + "\t");
                }
                System.out.println();
            }
            
            System.out.print("  ");
            for(int i=0; i<row1.length; i++){
                System.out.print(row1[i] + " ");
            }
    
            System.out.println();
    
            
            for(int i=0; i<row2.length; i++){
                System.out.print(row2[i] + " ");
            }
            
            System.out.println();
            
            for(int i=0; i<row3.length; i++){
                System.out.print(row3[i] + " ");
            }
            System.out.println();
            System.out.print(" ");
            for(int i=0; i<row4.length; i++){
                System.out.print(row4[i] + " ");
            }
            System.out.println();
            
            System.out.print("Please open a case (1 - 26)(Case"+e+"/"+casesToOpen+") : "); 
            caseOpenInput = Integer.parseInt(br.readLine());
            caseOpen(caseOpenInput, gameBoard, fakeBoard, row1, row2, row3, row4);
        }
        double offer = bankerDeal(fakeBoard, roundNum);
        
            System.out.print("The banker offered you $"+offer+" - Deal or No Deal? --  (1 for Deal, 2 for No Deal) ");
            dealOrNoDeal = Integer.parseInt(br.readLine());
            if(dealOrNoDeal == 1){
                System.out.println("No deal! \n \n");
                casesToOpen--;
                roundNum++;
            }
            else{
                System.out.println("You win $"+offer+"!");
                System.out.println("Game over.");
                break;
        }
    }
}
public static void pickCase(int x, int[] row1, int[] row2, int[] row3, int[] row4) {
        switch(x){
            case 1: row1[0] = 0; break;
            case 2: row1[1] = 0; break;
            case 3: row1[2] = 0;  break;
            case 4: row1[3] = 0; break;
            case 5: row1[4] = 0; break;
            case 6:  row1[5] = 0; break;
            case 7: row2[0] = 0; break;
            case 8:  row2[1] = 0; break;
            case 9: row2[2] = 0; break;
            case 10: row2[3] = 0; break;
            case 11:  row2[4] = 0; break;
            case 12: row2[5] = 0; break;
            case 13: row2[6] = 0; break;
            case 14: row3[0] = 0; break;
            case 15: row3[1] = 0;  break;
            case 16: row3[2] = 0; break;
            case 17: row3[3] = 0;  break;
            case 18:  row3[4] = 0; break;
            case 19: row3[5] = 0; break;
            case 20: row3[6] = 0; break;
            case 21: row4[0] = 0; break;
            case 22: row4[1] = 0; break;
            case 23: row4[2] = 0; break;
            case 24: row4[3] = 0;   break;
            case 25: row4[4] = 0;  break;
            case 26: row4[5] = 0;  break;
        }
    }
    public static void caseOpen(int x, double[][] gameBoard, double[][] fakeBoard, int[] row1, int[] row2, int[] row3, int[] row4) {
        System.out.print("Case "+x+" Contains: ");
        switch(x){
            case 1:
                System.out.print(gameBoard[0][0]+"\n");
                gameBoard[0][0] = 0;
                fakeBoard[0][0] = 0;
                row1[0] = 0;
                break;
            case 2:
                System.out.print(gameBoard[1][0]+"\n");
                gameBoard[1][0] = 0;
                fakeBoard[1][0] = 0;
                row1[1] = 0;
                break;
            case 3:
                System.out.print(gameBoard[2][0]+"\n");
                gameBoard[2][0] = 0;
                fakeBoard[2][0] = 0;
                row1[2] = 0;
                break;
            case 4:
                System.out.print(gameBoard[3][0]+"\n");
                gameBoard[3][0] = 0;
                fakeBoard[3][0] = 0;
                row1[3] = 0;
                break;
            case 5:
                System.out.print(gameBoard[4][0]+"\n");
                gameBoard[4][0] = 0;
                fakeBoard[4][0] = 0;
                row1[4] = 0;
                break;
            case 6:
                System.out.print(gameBoard[5][0]+"\n");
                gameBoard[5][0] = 0;
                fakeBoard[5][0] = 0;
                row1[5] = 0;
                break;
            case 7:
                System.out.print(gameBoard[6][0]+"\n");
                gameBoard[6][0] = 0;
                fakeBoard[6][0] = 0;
                row2[0] = 0;
                break;
            case 8:
                System.out.print(gameBoard[7][0]+"\n");
                gameBoard[7][0] = 0;
                fakeBoard[7][0] = 0;
                row2[1] = 0;
                break;
            case 9:
                System.out.print(gameBoard[8][0]+"\n");
                gameBoard[8][0] = 0;
                fakeBoard[8][0] = 0;
                row2[2] = 0;
                break;
            case 10:
                System.out.print(gameBoard[9][0]+"\n");
                gameBoard[9][0] = 0;
                fakeBoard[9][0] = 0;
                row2[3] = 0;
                break;
            case 11:
                System.out.print(gameBoard[10][0]+"\n");
                gameBoard[10][0] = 0;
                fakeBoard[10][0] = 0;
                row2[4] = 0;
                break;
            case 12:
                System.out.print(gameBoard[11][0]+"\n");
                gameBoard[11][0] = 0;
                fakeBoard[11][0] = 0;
                row2[5] = 0;
                break;
            case 13:
                System.out.print(gameBoard[12][0]+"\n");
                gameBoard[12][0] = 0;
                fakeBoard[12][0] = 0;
                row2[6] = 0;
                break;
            case 14:
                System.out.print(gameBoard[0][1]+"\n");
                gameBoard[0][1] = 0;
                fakeBoard[0][1] = 0;
                row3[0] = 0;
                break;
            case 15:
                System.out.print(gameBoard[1][1]+"\n");
                gameBoard[1][1] = 0;
                fakeBoard[1][1] = 0;
            case 16:
                System.out.print(gameBoard[2][1]+"\n");
                gameBoard[2][1] = 0;
                fakeBoard[2][1] = 0;
                row3[2] = 0;
                break;
            case 17:
                System.out.print(gameBoard[3][1]+"\n");
                gameBoard[3][1] = 0;
                fakeBoard[3][1] = 0;
                row3[3] = 0;
                row3[1] = 0;
                break;
               
            case 18:
                System.out.print(gameBoard[4][1]+"\n");
                gameBoard[4][1] = 0;
                fakeBoard[4][1] = 0;
                row3[4] = 0;
                break;
            case 19:
                System.out.print(gameBoard[5][1]+"\n");
                gameBoard[5][1] = 0;
                fakeBoard[5][1] = 0;
                row3[5] = 0;
                break;
            case 20:
                System.out.print(gameBoard[6][1]+"\n");
                gameBoard[6][1] = 0;
                fakeBoard[6][1] = 0;
                row3[6] = 0;
                break;
            case 21:
                System.out.print(gameBoard[7][1]+"\n");
                gameBoard[7][1] = 0;
                fakeBoard[7][1] = 0;
                row4[0] = 0;
                break;
            case 22:
                System.out.print(gameBoard[8][1]+"\n");
                gameBoard[8][1] = 0;
                fakeBoard[8][1] = 0;
                row4[1] = 0;
                break;
            case 23:
                System.out.print(gameBoard[9][1]+"\n");
                gameBoard[9][1] = 0;
                fakeBoard[9][1] = 0;
                row4[2] = 0;
                break;
            case 24:
                System.out.print(gameBoard[10][1]+"\n");
                gameBoard[10][1] = 0;
                fakeBoard[10][1] = 0;
                row4[3] = 0;
                break;
            case 25:
                System.out.print(gameBoard[11][1]+"\n");
                gameBoard[11][1] = 0;
                fakeBoard[11][1] = 0;
                row4[4] = 0;
                break;
            case 26:
                System.out.print(gameBoard[12][1]+"\n");
                gameBoard[12][1] = 0;
                fakeBoard[12][1] = 0;
                row4[5] = 0;
                break;
                
            }
}
        
        public static double bankerDeal(double[][] x, int y) {
            double sumArray[] = new double[26], sum=0, numCount=0;
            for(int r=0; r<x.length; r++){
                for(int c=0; c<x[r].length; c++){
                    for(int i=0; i<sumArray.length; i++){
                        x[r][c] = sumArray[i];
                    }
                }
            }
            for(int i=0; i<sumArray.length; i++){
            sum+=sumArray[i];
            numCount++;
        }
        return (sum/numCount) * y/10;
    }
                    
        
        
        
}