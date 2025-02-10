//Pagina 21 - Leggere da tastiera l'età di tre persone e calcolarne la media

package es_pag_21_redavid;

//importazione delle librerie contenenti classi, oggetti e metodi utili alla scrittura e al funzionamento del codice
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Es_Pag_21_Redavid {

    public static void main(String[] args) { //è il metodo principale, eseguito sempre per primo all'avvio del programma
        //area dedita alla dichiarazione delle variabili e dell'oggetto volto all'acquisizione dell'input
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader tastiera = new BufferedReader (input);
        
        int eta[] = new int[3]; //array (vettore) contenente 3 elementi, ovvero le tre età
        double sum = 0; //variabile floating point a DOPPIA precisione contenente la somma delle età, inizializzata a zero
        double media = 0; //variabile floating point a DOPPIA precisione contenente la media delle età, inizializzata a 0
        
        for (int i=0; i<3; i++) { //struttura di iterazione definita FOR nella quale vengono dichiarati il contatore, la condizione e l'incremento del contatore a ogni ciclo
            System.out.print("\nInserire l'età della " + (i+1) + "^ persona: "); //stampo a schermo il messaggio tra i doppi apici
            try { //verifica che il valore inserito sia del tipo richiesto dal programma
                eta[i] = Integer.parseInt(tastiera.readLine()); //legge il valore della stringa inserita, convertendolo direttamente al tipo INT
            } catch (IOException ex) { //cattura l'eccezione nell'inserimento del valore, eventualmente di tipo diverso da quello richiesto
                Logger.getLogger(Es_Pag_21_Redavid.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            sum += eta[i]; //aggiungo al valore della somma quello presente nell'array eta[] presente alla posizione corrispondente al valore di i (eta[i])
        }
        
        media = sum/3; //calcola la media effettuando la divisione della somma per 3
        
        System.out.println("La media delle età è di " + media + " anni"); //stampa la media a schermo
    }
    
}
