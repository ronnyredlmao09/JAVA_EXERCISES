
package esercizio_3_natale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Esercizio_3_Natale {
    public static InputStreamReader input = new InputStreamReader (System.in);
    public static BufferedReader tastiera = new BufferedReader (input);
    
    public static int array[], lun = 0;
    
    public static void main(String[] args) throws IOException {
        int choice = 0;
        
        do {
            System.out.print("\n0 - Esci\n1 - Carica array\n2 - Visualizza array\n3 - Questo elemento e\' presente?\nInserire opzione: ");
            choice = Integer.parseInt(tastiera.readLine());
            
            switch (choice) {
                case 0: System.out.print("\nArrivederci"); break;
                case 1: caricaArray(); break;
                case 2: visualizzaArray(); break;
                case 3: presenzaArray(); break;
                default: System.out.print("\nErrore nell\'opzione"); break;
            }
        }
        while (choice != 0);
    }
    
    public static void caricaArray() throws IOException {
        do {
            System.out.print("\nInserire lunghezza array (minore di 30): ");
            lun = Integer.parseInt(tastiera.readLine());
        }
        while (lun > 30);
        
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
    
    public static void presenzaArray() throws IOException {
        int input_array = 0, cont = 0;
        
        System.out.print("\nDi quale numero verificare la presenza nell\'array?: ");
        input_array = Integer.parseInt(tastiera.readLine());
        
        for (int i=0; i<lun; i++) {
            if (array[i] == input_array)
               cont++; 
        }
        
        if (cont == 0) 
            System.out.print("\n"+ input_array +" non e\' presente nell\'array");
        else 
            System.out.print("\n"+ input_array +" e\' presente "+ cont +" volte nell\'array");
    }
    
}
