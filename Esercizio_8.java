//Esegui una ricerca in un array: dopo aver generato un array di 30 numeri casuali tra 0 e 99, determina se è presente il numero 50
package esercizio_8;

import java.util.Random;


public class Esercizio_8 {

    
    public static void main(String[] args) {
        Random rand = new Random();
        int num[] = new int[30];
        
        for (int i=0; i<num.length; i++) {
            num[i] = rand.nextInt(100);
        }
        
        System.out.println("L\'array di numeri interi e\':");
        
        for (int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
        
        for (int i=0; i<num.length; i++) {
            if (num[i] == 50) {
                System.out.println("\nE\' presente il numero 50");
                System.exit(0);
            }
        }
        
        System.out.println("\nNon e\' presente il numero 50");
    }
    
}
