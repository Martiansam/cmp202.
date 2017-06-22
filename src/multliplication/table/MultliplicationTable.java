/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multliplication.table;

/**
 *
 * @author Sammy
 */
import java.util.Scanner;
public class MultliplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        
        int x;
        int tot;
        
        for (x = 1; x <= 12; x = x + 1) {
            
            tot = x * 2; // change the multiple
            
        System.out.print("2 * "+ x); // change the out print to your 
        System.out.println(" = " + tot);
        }
    }
    
}
