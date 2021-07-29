public class Cameriere extends Personale{

    public Cameriere(String nome, Coda coda) {
        super(nome, coda);
    }

    public void inserisciOrdine(Tavolo tavolo, Piatto piatto){
        Ordine ordine = new Ordine(piatto, tavolo, this);
        getCoda().aggiungiOrdine(ordine);
    }
}
