//Dopo aver caricato in memoria un array di numeri con 10 componenti, conta le componenti che hanno valore superiore a 18
package esercizio_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Esercizio_6 {

    
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader tastiera = new BufferedReader (input);
        
        int num[] = new int[10], cont = 0;
        
        for (int i=0; i<num.length; i++) {
            System.out.print("Inserire il " + (i+1) + "o numero intero: ");
            try {
                num[i] = Integer.parseInt(tastiera.readLine());
            } catch (IOException ex) {
                Logger.getLogger(Esercizio_6.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (num[i] > 18) 
                cont++;
        }
        
        System.out.println("L\'array di numeri interi e\':");
        
        for (int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
        
        System.out.println("\nI numeri superiori a 18 sono: " + cont);
    }
    
}
