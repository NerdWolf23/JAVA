import java.util.Scanner;


/*biglietto  Su una linea ferroviaria, rispetto alla tariffa piena, gli utenti pensionati usufruiscono di uno sconto del 10%, gli studenti del 15% e i disoccupati del 25%. Codificando i pensionati con una P, gli studenti con una S e i disoccupati con una D, scrivere un programma che, richiesto il costo di un biglietto e l'eventuale condizione particolare dell'utente, visualizzi l'importo da pagare.*/


public class Biglietto {
    public static void main(String[] args){
        final double PERC_SCONTO_PENSIONATI = 0.10;
        final double PERC_SCONTO_STUDENTI = 0.15;
        final double PERC_SCONTO_DISOCCUPATI = 0.25;
        double percSconto;
        double costoIniziale, sconto, costoFinale;
        char categoria;
        Scanner s = new Scanner(System.in);

        System.out.println("Costo iniziale del Biglietto (Euro): ");
        costoIniziale = s.nextDouble();

        System.out.println( "indicare la categoria dell'utente.");

        System.out.println("P - Pensionato");
        System.out.println("S - Studente");
        System.out.println("D - Disoccupato");
        System.out.println("Altro tasto - Applicazione della tariffa piena");

        //legge una stringa da tastiera, la trasf. in maiusc. e poi prende il primo carattere

        categoria = s.next().toUpperCase().charAt(0);

        switch(categoria){
            case 'P':
                percSconto = PERC_SCONTO_PENSIONATI;
                break;
            case 'S':
                percSconto = PERC_SCONTO_STUDENTI;
                break;
            case 'D':
                percSconto = PERC_SCONTO_DISOCCUPATI;
                break;
            default: 
                percSconto = 0.0;
        }
        sconto = percSconto * costoIniziale;
        costoFinale = costoIniziale - sconto;

        System.out.format("%nCosto iniziale: %.2f Euro%n", costoIniziale);
        System.out.format("Sconto applicato: %.2f Euro%n", sconto);
        System.out.format("Costo finale: %.2f Euro%n", costoFinale);
    }
}
