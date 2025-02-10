/*
Scrivi un programma che consenta di inserire i nomi di 5 città con il rispettivo numero di abitanti.
Successivamente deve restituire il nome della città maggiormente popolata.
*/
package esercizio_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Esercizio_9 {

    
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader tastiera = new BufferedReader (input);
        
        String citta[] = new String[5], citta_max = "";
        int abitanti[] = new int[5], max = Integer.MIN_VALUE;
        
        for (int i=0; i<citta.length; i++) {
            System.out.print("\nInserire il nome della "+ (i+1) + "^ citta\': ");
            try {
                citta[i] = tastiera.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Esercizio_9.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.print("\nInserire gli abitanti: ");
            try {
                abitanti[i] = Integer.parseInt(tastiera.readLine());
            } catch (IOException ex) {
                Logger.getLogger(Esercizio_9.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (abitanti[i] > max) {
                max = abitanti[i];
                citta_max = citta[i];
            }
        }
        
        System.out.println("La citta\' con il maggior numero di abitanti (" + max + ") e\' " + citta_max);
    }
    
}
