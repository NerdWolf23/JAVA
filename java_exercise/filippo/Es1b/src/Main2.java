import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // es.4 p.255 di Savitch
        // inseriamo un numero di telefono, come stringa, in un'array ...
        // ... e contare quante volte ogni cifra appare e stampare il tutto

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci numero di telefono");
        String tel = tastiera.nextLine();

        // contatore for che controlla a che indice ti trovi
        int i;
        // contatore for che controlla quante volte la cifra si ripete
        int j;

        // inserisco una dimensione che varia in base al numero di telefono inserito
        int dimtel = tel.length();

        // array di char (per ogni cifra)
        char[] array = new char[dimtel];

        // ogni cifra va in una cella di array
        for(i=0;i<dimtel;i++){
            array[i] = tel.charAt(i);
        }

        // stampa array
        System.out.print("[ ");
        for(i=0;i<dimtel;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        // separatore
        System.out.println(" ");

        // contatore per la quantità di cifre uguali
        int cnt = 0;

        // ciclo for per contare le cifre uguali
        for(i=0;i< array.length;i++){
            for(j=0;j< array.length;j++){
                if(array[j]==array[i]){
                    cnt++;
                }
            }
            System.out.println("La cifra " + array[i] + " si ripete " + cnt + " volte");
            cnt=0;
        }

    }
}
