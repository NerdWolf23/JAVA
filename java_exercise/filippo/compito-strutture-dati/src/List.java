public abstract class List {

    public abstract List add(int x, int i);

    // rimuove tutte le occorrenze di x
    public abstract List remove(int x);

    // Conta il numero di dispari nella lista
    public abstract int countOdd();

    // ritorna una lista **nuova** (senza distruggere la precedente) con i valori doppi.
//    public abstract List doubleValue();

    // ridefinire il metodo equals

    public abstract int countOdd(List l);

    public abstract List getNext();
}
