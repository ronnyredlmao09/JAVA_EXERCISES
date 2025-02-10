
package esercizio_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Esercizio_11 {
    public static InputStreamReader input = new InputStreamReader (System.in);
    public static BufferedReader tastiera = new BufferedReader (input);
    
    public static int choice = 0, lun = 0, array[], cont1 = 0, cont2 = 0;

    public static void main(String[] args) throws IOException {
        do {
            System.out.print("\n0 - Esci\n1 - Carica vettore con numeri interi\n2 - L'array e\' ordinato?\nInserire scelta: ");
            choice = Integer.parseInt(tastiera.readLine());
            
            switch (choice) {
                case 0: break;
                case 1: caricaVettore(); break;
                case 2: ordineVettore(); break;
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
            System.out.print("\nInserire il "+(i+1)+"o elemento: ");
            array[i] = Integer.parseInt(tastiera.readLine());
        }
        
        System.out.print("\nArray caricato con successo");
    }
    
    public static void ordineVettore() {
       System.out.print("\nArray: ");
        
        for (int i=0; i<lun; i++) {
            System.out.print(array[i] + " ");
        } 
        
        cont1 = 0;
        cont2 = 0;
        
        for (int i=0; i<lun-1; i++) {
            if (array[i] > array[i+1]) 
                cont1++;
            else 
                cont2++;
        }
        
        if (cont1 == lun-1)
            System.out.print("\nOrdinato in senso decrescente");
        else if (cont2 == lun-1)
            System.out.print("\nOrdinato in senso crescente");
        else 
            System.out.print("\nNon ordinato");
    }
}
