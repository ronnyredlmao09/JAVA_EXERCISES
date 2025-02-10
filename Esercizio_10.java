
package esercizio_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Esercizio_10 {
    public static InputStreamReader input = new InputStreamReader (System.in);
    public static BufferedReader tastiera = new BufferedReader (input);
    
    public static int lun = 0;
    public static Random rand = new Random();
    public static int array[];
    public static int tmp = 0;
    public static int choice = 0;

    public static void main(String[] args) throws IOException {
        do {
            System.out.print("\n0 - Esci\n1 - Carica vettore con numeri casuali\n2 - Visualizza vettore\n3 - Ruota vettore\nInserire scelta: ");
            choice = Integer.parseInt(tastiera.readLine());
            
            switch (choice) {
                case 0: break;
                case 1: caricaVettore(); break;
                case 2: visualizzaVettore(); break;
                case 3: ruotaVettore(); break;
                default: System.out.print("\nScelta non valida!"); break;
            }
        }
        while (choice != 0);
    }
    
    public static void caricaVettore() throws IOException {
        System.out.print("\nInserire lunghezza array: ");
        lun = Integer.parseInt(tastiera.readLine());
        
        array = new int[lun];
        
        for (int i=0; i<lun; i++) {
            array[i] = rand.nextInt(100);
        }
        
        System.out.print("\nArray caricato con successo con dei valori interi generati casualmente");
    }
    
    public static void visualizzaVettore() {
        System.out.print("\nElementi del vettore: ");
        
        for (int i=0; i<lun; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void ruotaVettore() {
        
        tmp = array[lun-1];
        
        for (int i=lun-1; i>=1; i--) {
            array[i] = array[i-1];
        }
        
        array[0] = tmp;
        
        System.out.print("\nArray ruotato con successo");
    }
    
}
