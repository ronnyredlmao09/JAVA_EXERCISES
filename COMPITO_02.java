package compito_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class COMPITO_02 {
    public static InputStreamReader input = new InputStreamReader (System.in);
    public static BufferedReader tastiera = new BufferedReader (input);
    public static int choice = 0, lun = 0;
    public static double avgt = 0, avgp = 0, sumt = 0, sump = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
    public static double temp[], prec[];
    public static String cities[], maxt = "", minp = "";
    
    public static void main(String[] args) throws IOException {
        do {
            System.out.println("\n0 - Esci\n1 - Carica vettori\n2 - Visualizza temperature e precipitazioni medie globali\n3 - Citta\' con la temperatura piu\' alta\n4 - Citta\' con le precipitazioni piu\' basse");
            choice = Integer.parseInt(tastiera.readLine());
            switch (choice) {
                case 0:
                    System.out.println("A presto!");
                    break;
                case 1:
                    caricaVettori();
                    break;
                case 2:
                    Medie();
                    break;
                case 3:
                    maxTemp();
                    break;
                case 4:
                    minPrec();
                    break;
                default:
                    System.out.println("Scelta errata!");
                    break;
            }
        }
        while (choice != 0);
    }
    
    public static void caricaVettori() throws IOException {
        System.out.print("\nInserire la lunghezza dei vettori: ");
        lun = Integer.parseInt(tastiera.readLine());
        
        temp = new double[lun];
        prec = new double[lun];
        cities = new String[lun];
        
        for (int i=0; i<lun; i++) {
            System.out.print("\nInserire nome della citta\': ");
            cities[i] = tastiera.readLine();
            System.out.print("\nInserire temperatura mensile della citta\': ");
            temp[i] = Double.parseDouble(tastiera.readLine());
            System.out.print("\nInserire precipitazioni mensili della citta\': ");
            prec[i] = Double.parseDouble(tastiera.readLine());
        }
    }
    
    public static void Medie() {
        for (int i=0; i<lun; i++) {
            sumt += temp[i];
            sump += prec[i];
        }
        
        avgt = sumt/lun;
        avgp = sump/lun;
        
        System.out.println("\nTemperatura media globale: "+ avgt +"°C");
        System.out.println("\nPrecipitazioni medie globali: "+ avgp +"mm");
    }
    
    public static void maxTemp() {
        for (int i=0; i<lun; i++) {
            if (temp[i] > max) {
                max = temp[i];
                maxt = cities[i];
            }
        }
        
        System.out.println("\nLa citta\' con la temperatura piu\' alta e\': "+ maxt +" ("+ max +"°C)");
    }
    
    public static void minPrec() {
        for (int i=0; i<lun; i++) {
            if (prec[i] < min) {
                min = prec[i];
                minp = cities[i];
            }
        }
        
        System.out.println("\nLa citta\' con le precipitazioni piu\' basse e\': "+ minp +" ("+ min +"mm)");
    }
    
}
