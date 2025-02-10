
package esercizio_8_natale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Esercizio_8_Natale {
    public static InputStreamReader input = new InputStreamReader (System.in);
    public static BufferedReader tastiera = new BufferedReader (input);
    
    public static int array[], lun = 0;
    
    public static void main(String[] args) throws IOException {
        int choice = 0;
        
        do {
            System.out.print("\n0 - Esci\n1 - Carica array\n2 - Visualizza array\n3 - Shift elementi (sinistra)\n4 - Shift elementi (destra)\nInserire opzione: ");
            choice = Integer.parseInt(tastiera.readLine());
            
            switch (choice) {
                case 0: System.out.print("\nArrivederci"); break;
                case 1: caricaArray(); break;
                case 2: visualizzaArray(); break;
                case 3: sinistraArray(); break;
                case 4: destraArray(); break;
                default: System.out.print("\nErrore nell\'opzione"); break;
            }
        }
        while (choice != 0);
    }
    
    public static void caricaArray() throws IOException {
        System.out.print("\nInserire lunghezza array: ");
        lun = Integer.parseInt(tastiera.readLine());

        array = new int[lun];
        
        for (int i=0; i<lun; i++) {
            System.out.print("\nInserire "+ (i+1) +"o elemento intero: ");
            array[i] = Integer.parseInt(tastiera.readLine());
        }
    }
    
    public static void visualizzaArray() {
        System.out.print("\nArray: ");
        
        for (int i=0; i<array.length-1; i++) {
            System.out.print(array[i] + " - ");
        }
        
        System.out.print(array[array.length-1]);
    }
    
    public static void sinistraArray() throws IOException {
        int tmp = array[0];
        
        for (int i=1; i<lun; i++) {
            array[i-1] = array[i];
        }
        
        array[lun-1] = tmp;
        
        System.out.print("\nShift eseguito correttamente");
    }
    
    public static void destraArray() throws IOException {
        int tmp = array[lun-1];
        
        for (int i=lun-1; i>=1; i--) {
            array[i] = array[i-1];
        }
        
        array[0] = tmp;
        
        System.out.print("\nShift eseguito correttamente");
    }

}
