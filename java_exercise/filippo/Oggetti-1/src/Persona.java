import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
    // PUBLIC: CI PERMETTE DI ACCEDERE A QUALSIASI VARIABILE
    // PRIVATE: NON RIUSCIAMO A UTILZZARLO IN STUDENTE, CHE È UN'ALTRA CLASSE
    // PROTECTED: CI FA ACCEDERE A TUTTE LE VARIABILI DELLO STESSO PACKAGE
    protected String nome;
    protected String cognome;
    protected Date dataNascita;
    protected int altezza;
    protected Sesso sesso;


    // COSTRUTTORE
    public Persona(String nome, String cognome, Date dataNascita, int altezza, Sesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.altezza = altezza;
        this.sesso = sesso;
    }

    // COSTRUTTORE (è stato creato tanto per esercitarsi)
    public Persona(String nome, String cognome, Sesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
    }


    // GETTER AND SETTER
    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    // METODO CHE PUÒ CHIAMARE SOLO SUO FIGLIO (STUDENTE)
    protected String getDataString(){
        String pattern = "dd-MM-yyyy";
        // https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String data;

        // ABBIAMO GESTITO IL PROBLEMA, IN CASO DESSE ERRORE CON simpleDateFormat ...
        // ... LO GESTIAMO STAMPANDO "NON DISPONIBILE"
        try{
            data = simpleDateFormat.format(dataNascita);
        }catch (Exception e){
            data = "NON DISPONIBILE";
        }

        // STAMPIAMO IL TUTTO
        return "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + data +
                ", altezza=" + altezza +
                ", sesso=" + sesso;
    }

    // OVERRIDE -> TOSTRING
    @Override
    public String toString() {

        // INCOLLIAMO IL METODO SOPRA AGGIUNGENDO LO STUDENTE
        return "Persona{"+getDataString()+"}";
    }
}
