import java.util.Scanner;

/*parallelepipedo  Scrivere un programma che, richieste in input lunghezza, larghezza e altezza di un parallelepipedo, ne calcoli la superficie totale e il volume.*/

public class Parallelepipedo {

    public static void main(String[] args) {
        double lun, lar, alt;
        double Abase, Alat, Atot;
        double V;


        Scanner s = new Scanner(System.in);
        System.out.println("Inserire le dimensioni del parallelepipedo.");
        System.out.println("Lunghezza: ");
        lun = s.nextDouble();
        System.out.println("Larghezza: ");
        lar = s.nextDouble();
        System.out.println("Altezza: ");
        alt = s.nextDouble();

        Abase = lun * lar;
        Alat = 2 * (lun + lar) * alt;
        Atot = Alat + 2 * Abase;
        V = lun * lar * alt;

        System.out.format("Area totale: %.2f%n" , Atot);
        System.out.format("Volume: %.2f%n", V);  
    }
}