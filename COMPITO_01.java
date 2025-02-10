
package compito_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class COMPITO_01 {
    public static InputStreamReader input = new InputStreamReader (System.in);
    public static BufferedReader tastiera = new BufferedReader (input);
    public static int max = 0, quantita = 0;
    public static String nomi[];
    public static double prezzi[];
    public static double prezzi2[];
    public static double iva = 0;
    public static double totale = 0;
    public static double min = Double.MAX_VALUE;
    public static String basso = "";
    
    public static void main(String[] args) throws IOException {
        int choice = 0;
        do {
            System.out.println("\n0 - Esci\n1 - Allocare il vettore\n2 - Caricare vettore\n3 - Visualizzare totale\n4 - Prodotto col prezzo piu\' basso");
            choice = Integer.parseInt(tastiera.readLine());

            switch (choice) {
                case 0:
                    break;
                case 1:
                    allocazioneVettore();
                    break;
                case 2:
                    caricaVettore();
                    break;
                case 3:
                    visualizzaTotale();
                    break;
                case 4:
                    prezzopiuBasso();
                    break;
                default: 
                    System.out.println("Scelta non corretta!");
                    break;
            }
        }
        while (choice != 0);
    }
    
    public static void allocazioneVettore() throws IOException {
        System.out.print("Inserire grandezza del vettore: ");
        max = Integer.parseInt(tastiera.readLine());
        nomi = new String[max];
        prezzi = new double[max];
        prezzi2 = new double[max];
    }
    
    public static void caricaVettore() throws IOException {
        for (int i=0; i<max; i++) {
            System.out.print("\nInserire nome prodotto: ");
            nomi[i] = tastiera.readLine();
            System.out.print("\nInserire prezzo unitario: ");
            prezzi[i] = Double.parseDouble(tastiera.readLine());
            System.out.print("\nInserire quantita\': ");
            quantita = Integer.parseInt(tastiera.readLine());
            prezzi2[i] = prezzi[i] * quantita;
            System.out.print("\nInserire IVA prodotto in %: ");
            iva = Double.parseDouble(tastiera.readLine());
            iva = (iva * prezzi2[i])/100;
            totale += (prezzi2[i] + iva);
        }
    }
    
    public static void visualizzaTotale() {
        System.out.println("€" + totale);
    }
    
    public static void prezzopiuBasso() {
        for (int i=0; i<max; i++) {
            if (prezzi[i] < min) {
                min = prezzi[i];
                basso = nomi[i];
            }
        }
        System.out.println("\nIl prodotto col prezzo piu\' basso e\' " + basso);
    }
}
