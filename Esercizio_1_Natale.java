
package esercizio_1_natale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Esercizio_1_Natale {
    public static InputStreamReader input = new InputStreamReader (System.in);
    public static BufferedReader tastiera = new BufferedReader (input);
    
    public static int array[] = new int[10];
    
    public static void main(String[] args) throws IOException {
        int choice = 0;
        
        do {
            System.out.print("\n0 - Esci\n1 - Carica array\n2 - Visualizza array\n3 - Rendere pari gli elementi dell\'array\nInserire opzione: ");
            choice = Integer.parseInt(tastiera.readLine());
            
            switch (choice) {
                case 0: System.out.print("\nArrivederci"); break;
                case 1: caricaArray(); break;
                case 2: visualizzaArray(); break;
                case 3: pariArray(); break;
                default: System.out.print("\nErrore nell\'opzione"); break;
            }
        }
        while (choice != 0);
    }
    
    public static void caricaArray() {
        Random rand = new Random();
        
        for (int i=0; i<array.length; i++) {
            array[i] = rand.nextInt(101);
        }
        
        System.out.print("\nArray caricato con valori interi casuali");
    }
    
    public static void visualizzaArray() {
        System.out.print("\nArray: ");
        
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void pariArray() {
        for (int i=0; i<array.length; i++) {
            if (array[i]%2 == 1) 
                array[i] = array[i] + 1;
        }
        
        System.out.print("\nI valori dispari dell\'array sono stati sostituiti con dei valori pari");
    }
}
