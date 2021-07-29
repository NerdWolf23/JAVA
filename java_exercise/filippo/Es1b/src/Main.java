import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // es.2 p.205 di Savitch
        // stampiamo ciao + il nome inserito in input un numero ...
        // ... di volte pari al numero inserito sempre in input

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci nome");
        String nome = tastiera.next();

        System.out.println("Inserisci il numero di ripetizioni");
        int rip = tastiera.nextInt();

        saluta(nome, rip);

    }

    public static void saluta(String nome, int rip){
        for(int i=0;i<rip;i++){
            System.out.println("Ciao " + nome);
        }
    }

}
