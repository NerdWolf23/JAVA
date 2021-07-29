import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // per l'anno
        Scanner tastiera = new Scanner(System.in);
        // per l'array
        Scanner scarray = new Scanner(System.in);

        String scelta;
        int i = 0;

        do {
            // inseriamo l'anno in input
            System.out.println("Inserisci anno");
            int anno = tastiera.nextInt();

            // controlliamo se l'anno scritto in input è bisestile o meno
            if(bisestile(anno)==true){
                System.out.println("L'anno " + anno + " è bisestile");
            } else System.out.println("L'anno " + anno + " non è bisestile");

            // inseriamo la scelta in input
            System.out.println("Vuoi inserire l'anno? (y/n)");
            scelta = tastiera.next();

        } while (scelta.equals("y"));
        // ipoteticamente si potrebbe scrivere (scelta=="y") ma riesce solo a compilarla e non ad eseguirla
        // per confrontare le stringhe si usa equals()

// --------------------------------------------------------------------

        // scegliamo dimensione array
        System.out.println("Scegli dimensione l'array");
        int n = scarray.nextInt();

        int[] array = new int[n];

        // inserimento dati in array
        for (i=0;i<n;i++) {
            System.out.println("Inserisci dato:");
            array[i] = tastiera.nextInt();
        }

        // invertiamo l'ordine degli elementi dell'array
        inverti(array);


        // stampa array al contrario
        System.out.print("[ ");
        for (i=0;i< n;i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

    }



    public static boolean bisestile(int anno){
//        Dalla regola del calendario gregoriano:
//        Un anno è bisestile se il suo numero è divisibile per 4,
//        con l'eccezione degli anni secolari (quelli divisibili per 100)
//        che non sono divisibili per 400.

        boolean risp;
        if(anno%400==0){
            risp = true;
        } else if(anno%4==0 && anno%100!=0){
            risp = true;
        } else risp = false;

        return risp;
    }



    public static int[] inverti(int[] array){
        // semplice contatore
        int i;

        // dimensione dell'array
        int n = array.length;

        // serve per indietreggiare con l'indice dell'array
        int p = 1;

        // variabile temporanea per lo scambio di elementi
        int tmp;

        // andiamo a scambiare gli elementi usando tmp
        for (i=0;i< (n/2);i++) {
            // con il ciclo ci fermiamo a metà altrimenti continuerebbe a scambiare gli elementi ...
            // ... facendoli tornare alla loro posizione originale
            tmp=array[i];
            array[i]= array[n-p];
            array[n-p]=tmp;
            p++;
        }


        return array;
    }


}
