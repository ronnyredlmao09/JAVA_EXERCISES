
package esercizio_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Esercizio_13 {
    public static InputStreamReader input = new InputStreamReader (System.in);
    public static BufferedReader tastiera = new BufferedReader (input);
    
    public static Random rand = new Random();
    public static boolean array[] = new boolean[10];
    public static int choice = 0, isTrue = 0, isFalse = 0, value = 0;

    
    public static void main(String[] args) throws IOException {
        do {
            System.out.print("\n0 - Esci\n1 - Carica vettore con valori booleani casuali\n2 - Visualizzare il valore piu\' frequente\n3 - Visualizzare occorrenze di un valore\nInserire scelta: ");
            choice = Integer.parseInt(tastiera.readLine());
            
            switch (choice) {
                case 0: break;
                case 1: caricaVettore(); break;
                case 2: valorepiuFreq(); break;
                case 3: frequenzeValori(); break;
                default: System.out.print("\nScelta non valida!"); break;
            }
        }
        while (choice != 0);
    }
    
    public static void caricaVettore() {
        for (int i=0; i<10; i++) {
            array[i] = rand.nextBoolean();
        }
        
        System.out.print("\nArray caricato: ");
        for (int i=0; i<10; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void valorepiuFreq() {
        isTrue = 0;
        isFalse = 0;
        
        for (int i=0; i<10; i++) {
            if (array[i])
                isTrue++;
            else
                isFalse++;
        }
        
        if (isTrue > isFalse)
            System.out.print("\nTrue e\' piu\' frequente");
        else if (isTrue < isFalse)
            System.out.print("\nFalse e\' piu\' frequente");
        else
            System.out.print("\nEntrambi appaiono lo stesso numero di volte");
    }
    
    public static void frequenzeValori() throws IOException {
        isTrue = 0;
        isFalse = 0;
        
        do {
            System.out.print("\nQuale valore si vuole controllare? 0 (False)/1 (True): ");
            value = Integer.parseInt(tastiera.readLine());
        }
        while (value != 0 && value != 1);
        
        if (value == 1) {
            for (int i=0; i<10; i++) {
            if (array[i])
                isTrue++;
            }
            System.out.print("\nRicorrenze di True: "+ isTrue);
        }
        else {
            for (int i=0; i<10; i++) {
            if (!array[i])
                isFalse++;
            }
            System.out.print("\nRicorrenze di False: "+ isFalse);
        }
    }
}
