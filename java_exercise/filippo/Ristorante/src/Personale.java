public class Personale {
    private String nome;
    private Coda coda;

    // COSTRUTTORE
    public Personale(String nome, Coda coda) {
        this.nome = nome;
        this.coda = coda;
    }

    // GETTER
    public String getNome() {
        return nome;
    }

    // GETTER
    public Coda getCoda() {
        return coda;
    }
}
