//Definisci un array di dimensione 10 e successivamente prova ad accedere all'elemento di posizione 20, gestendo l'eccezione che viene generata
package esercizio_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Esercizio_4 {

    
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader tastiera = new BufferedReader (input);
        
        String vettore[] = new String[10];
        
        System.out.print("Inserire valore di tipo stringa per l'array alla posizione 20: ");
        try {
            vettore[20] = tastiera.readLine();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice non valido! La lunghezza dell\'array e\' 10.");
        } catch (IOException e) {
            System.out.println("Valore non valido!");
        }
        
    }
    
}
