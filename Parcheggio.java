import java.util.Scanner;
/*parcheggio  Sapendo che in un parcheggio la prima ora costa 2.50 € mentre tutte le successive costano 1.50 €, scrivere un programma che richieda il numero complessivo delle ore e visualizzi il totale da pagare*/

public class Parcheggio {
    public static void main(String[] args) {
        final double TARIFFA1 = 2.50;
        final double TARIFFA2 = 1.50;
        int numOre;
        double tariffa = 0.00;

        Scanner s = new Scanner(System.in);
        do{
            System.out.print("Numero di ore: ");
            numOre = s.nextInt();
        }
        while (numOre < 0);

        if (numOre > 0)
            tariffa = TARIFFA1 + (numOre - 1) * TARIFFA2;

        System.out.format("Tariffa per %d ore: %.2f Euro%n", numOre, tariffa);
    }
}
