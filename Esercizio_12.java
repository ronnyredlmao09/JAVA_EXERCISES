
package esercizio_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Esercizio_12 {
    public static InputStreamReader input = new InputStreamReader (System.in);
    public static BufferedReader tastiera = new BufferedReader (input);
    
    public static int choice = 0, array1[] = new int[10], array2[] = new int[10], array3[] = new int[20], cont = 0;
    public static Random rand = new Random();

    public static void main(String[] args) throws IOException {
        do {
            System.out.print("\n0 - Esci\n1 - Carica primo vettore con numeri interi casuali\n2 - Carica secondo vettore con numeri interi casuali\n3 - Visualizza vettori\n4 - Fondi vettori\nInserire scelta: ");
            choice = Integer.parseInt(tastiera.readLine());
            
            switch (choice) {
                case 0: break;
                case 1: caricaVettoreUno(); break;
                case 2: caricaVettoreDue(); break;
                case 3: visualizzaVettori(); break;
                case 4: fondiVettori(); break;
                default: System.out.print("\nScelta non valida!"); break;
            }
        }
        while (choice != 0);
    }
    
    public static void caricaVettoreUno() {
        for (int i=0; i<10; i++) {
            array1[i] = rand.nextInt(100);
        }
        
        System.out.print("\nArray caricato con successo con dei valori interi generati casualmente");
    }
    
    public static void caricaVettoreDue() {
        for (int i=0; i<10; i++) {
            array2[i] = rand.nextInt(100);
        }
        
        System.out.print("\nArray caricato con successo con dei valori interi generati casualmente");
    }
    
    public static void visualizzaVettori() {
        System.out.print("\nElementi del primo vettore: ");
        
        for (int i=0; i<10; i++) {
            System.out.print(array1[i] + " ");
        }
        
        System.out.print("\nElementi del secondo vettore: ");
        
        for (int i=0; i<10; i++) {
            System.out.print(array2[i] + " ");
        }
    }
    
    public static void fondiVettori() {
        cont = 0;
        for (int i=0; i<20; i++) {
            if (i>=10) {
                array3[i] = array2[cont];
                cont++;
            }
            else 
                array3[i] = array1[i];
        }
        
        System.out.print("\nVettori fusi insieme: ");
        for (int i=0; i<20; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
