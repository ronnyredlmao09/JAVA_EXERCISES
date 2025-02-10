//Dopo aver caricato in memoria un array di numeri interi con 10 componenti, calcola il prodotto delle componenti.
package esercizio_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Esercizio_5 {

    
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader tastiera = new BufferedReader (input);
        
        int num[] = new int[10], prod = 1;
        
        for (int i=0; i<num.length; i++) {
            System.out.print("Inserire il " + (i+1) + "o numero intero: ");
            try {
                num[i] = Integer.parseInt(tastiera.readLine());
            } catch (IOException ex) {
                Logger.getLogger(Esercizio_5.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            prod *= num[i];
        }
        
        System.out.println("L\'array di numeri interi e\':");
        
        for (int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
        
        System.out.println("\nIl prodotto dei numeri e\': " + prod);
    }
    
}
