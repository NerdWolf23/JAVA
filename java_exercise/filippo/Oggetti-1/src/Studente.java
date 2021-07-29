import java.util.Date;

// STIAMO DICENDO CHE LO STUDENTE È UNA PERSONA, QUINDI EREDITÀ ...
// ... TUTTI I VALORI DELL'OGGETTO PERSONA
public class Studente extends Persona{
    // VIENE AGGIUNTO SOLAMENTE IN PIÙ L'ID
    private int id;

    // COSTRUTTORE
    public Studente(String nome, String cognome, Sesso sesso, int id) {
        // VIENE INSERITO PERCHÈ SUPER PRENDE I VALORI GIÀ CREATI DA UN'ALTRA PARTE
        super(nome, cognome, sesso);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "id=" + id + " " +getDataString() +
                '}';
    }
}
