//Considerare come input 10 voti di uno studente espressi in numeri e segnalare con un giudizio non numerico se il voto è negativo, sufficiente o positivo

package es_pag_26_27_redavid;

//importazione delle librerie contenenti classi, oggetti e metodi utili alla scrittura e al funzionamento del codice
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Es_Pag_26_27_Redavid {

    public static void main(String[] args) { //è il metodo principale, eseguito sempre per primo all'avvio del programma
        //area dedita alla dichiarazione delle variabili e dell'oggetto volto all'acquisizione dell'input
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader tastiera = new BufferedReader (input);
        
        double voto = 0; //variabile numerica floating point a DOPPIA precisione contenente i voti dello studente, inizializzata a 0
        
        for (int i=0; i<10; i++) { //struttura di iterazione definita FOR nella quale vengono dichiarati il contatore, la condizione e l'incremento del contatore a ogni ciclo
            System.out.print("\nInserire voto: "); //stampo a schermo il messaggio tra i doppi apici
            try { //verifica che il valore inserito sia del tipo richiesto dal programma
                voto = Double.parseDouble(tastiera.readLine()); //legge il valore della stringa inserita, convertendolo direttamente al tipo DOUBLE
            } catch (IOException ex) { //cattura l'eccezione nell'inserimento del valore, eventualmente di tipo diverso da quello richiesto
                Logger.getLogger(Es_Pag_26_27_Redavid.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (voto < 6) { //struttura di selezione IF nella quale viene eseguito il codice tra le graffe, se e soltanto se la condizione tra le tonde è VERA
                System.out.println("Il voto è negativo"); //stampo a schermo il messaggio tra i doppi apici
            }
            else if (voto == 6) {
                System.out.println("Il voto è sufficiente"); //stampo a schermo il messaggio tra i doppi apici
            }
            else {
                System.out.println("Il voto è positivo"); //stampo a schermo il messaggio tra i doppi apici
            } 
        }
        
    }
    
}
