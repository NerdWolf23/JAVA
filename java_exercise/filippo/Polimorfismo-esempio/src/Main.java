public class Main {
    public static void main(String[] args /* array di stringhe */) {
        Padre p = new Padre();
        // eseguiamo ciò chd c'è nel metodo 1 e 2 di p, che appartiene a Padre
        p.metodo1();
        p.metodo2();

        Figlio1 f1 = new Figlio1();
        f1.metodo1();
        // EREDITARIETÀ: anche se metodo2 non è presente in Figlio1, quest'ultimo prende il ...
        // ... metodo2 della classe Padre
        f1.metodo2();

        // POLIMORFISMO: TUTTE LE SOTTOCLASSI SONO ANCHE LE CLASSI (sia figlio che padre)
        Padre f2 = new Figlio2();
        if(f2 instanceof Figlio2){
            // CAST: cambiamo il tipo della variabile
            // abbiamo cambiato il tipo apparente di metodo3 di f2
            ((Figlio2)f2).metodo3();
        }


    }
}
