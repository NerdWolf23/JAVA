public abstract class List {
    // abstract ci è utile

    public abstract List addLast(int x);

    // creare metodo che inserisca un valore al centro della lista
    public abstract List add(int x, int i);

    // creare metodo che rimuova un valore al centro della lista
    public abstract List remove(int x);

    // creare metodo che rimuova un valore in una posizione precisa della lista
    public abstract List removeAtIndex(int i);

    // creare metodo che duplichi tutti gli elementi della lista
    public abstract List doppio();

    // true se tutti gli elementi sono pari
    public abstract boolean pari();

    // true se la lista è in ordine crescente
    public abstract boolean ordinata(int next);

    public abstract boolean ordinataCrescenteDecrescente(int next, int counter, int step);

    // ritorna la lunghezza della lista
    public abstract int length();

}
