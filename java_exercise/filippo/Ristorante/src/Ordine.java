public class Ordine {

    public enum Stato{
        RICEVUTO, IN_ELABORAZIONE, CONSEGNATO
    }

    private Piatto piatto;
    private Tavolo tavolo;
    private Cameriere cameriere;

    private Stato stato;

    public Ordine(Piatto piatto, Tavolo tavolo, Cameriere cameriere) {
        this.piatto = piatto;
        this.tavolo = tavolo;
        this.cameriere = cameriere;
        this.stato = Stato.RICEVUTO;
    }

    // -----------------------------------------------------------------------------
    // GETTER E SETTER
    public Piatto getPiatto() {
        return piatto;
    }

    public void setPiatto(Piatto piatto) {
        this.piatto = piatto;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public Cameriere getCameriere() {
        return cameriere;
    }

    public void setCameriere(Cameriere cameriere) {
        this.cameriere = cameriere;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }
    // -------------------------------------------------------------------------------------

    @Override
    public String toString(){
        return piatto +
                ", " + tavolo +
                ", " + cameriere +
                ", " + stato;
    }
}
